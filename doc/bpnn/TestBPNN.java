import com.csvreader.CsvReader;
import com.top.bpnn.BPModel;
import com.top.bpnn.BPNeuralNetworkFactory;
import com.top.bpnn.BPParameter;
import com.top.bpnn.Matrix;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;

/**
 * @program: jarTest
 * @description:
 * @author: Mr.Zhao
 * @create: 2020-07-16 22:50
 **/
public class Test1 {
    public static void main(String[] args) throws Exception {
        //读取trainData.csv中的数据
        CsvReader csvReader = new CsvReader("F:\\jarTest\\trainData.csv", ',', Charset.forName("UTF-8"));
        ArrayList<String[]> csvFileList = new ArrayList<String[]>();
        while (csvReader.readRecord()) {
            csvFileList.add(csvReader.getValues());
        }
        csvReader.close();
        double[][] trainArray = new double[csvFileList.size()][csvFileList.get(0).length];
        for (int i = 0; i < csvFileList.size(); i++) {
            for (int j = 0; j < csvFileList.get(0).length; j++) {
                trainArray[i][j] = Double.parseDouble(csvFileList.get(i)[j]);
            }
        }

        //创建训练集矩阵
        Matrix trainSet = new Matrix(trainArray);
        //创建BPNN工厂对象
        BPNeuralNetworkFactory factory = new BPNeuralNetworkFactory();
        //创建BP参数对象
        BPParameter bpParameter = new BPParameter();
        bpParameter.setInputLayerNeuronNum(4);
        bpParameter.setHiddenLayerNeuronNum(5);
        bpParameter.setPrecision(0.01);
        bpParameter.setMaxTimes(100000);

        //训练BP神经网络
        System.out.println(new Date());
        BPModel bpModel = factory.trainBP(bpParameter, trainSet);
        System.out.println(new Date());

        //将BPModel序列化到本地
        factory.serialize(bpModel, "test");

        //testData.csv中的数据
        CsvReader csvReader2 = new CsvReader("F:\\jarTest\\testData.csv", ',', Charset.forName("UTF-8"));
        ArrayList<String[]> csvFileList2 = new ArrayList<String[]>();
        while (csvReader2.readRecord()) {
            csvFileList2.add(csvReader2.getValues());
        }
        csvReader2.close();
        //完整的testSet，包含Input和Output，用于计算BP神经网络准确率
        double[][] testArray2 = new double[csvFileList2.size()][csvFileList2.get(0).length];
        for (int i = 0; i < csvFileList2.size(); i++) {
            for (int j = 0; j < csvFileList2.get(0).length; j++) {
                testArray2[i][j] = Double.parseDouble(csvFileList2.get(i)[j]);
            }
        }

        //仅包含testSet中的Input，用于计算BP神经网络计算结果
        double[][] testArray3 = new double[testArray2.length][testArray2[0].length-1];
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[0].length-1; j++) {
                testArray3[i][j] = testArray2[i][j];
            }
        }

        Matrix testSet = new Matrix(testArray3);

        //将BPModel反序列化
        BPModel bpModel1 = factory.deSerialization("test");
        Matrix result = factory.computeBP(bpModel1, testSet);

        int total = result.getMatrixRowNums();
        int correct = 0;
        for (int i = 0; i < result.getMatrixRowNums(); i++) {
            if(Math.round(result.getValOfIdx(i,0)) == testArray2[i][4]){
                correct++;
            }
        }
        double correctRate = Double.valueOf(correct) / Double.valueOf(total);

        System.out.println(correctRate);
    }
}