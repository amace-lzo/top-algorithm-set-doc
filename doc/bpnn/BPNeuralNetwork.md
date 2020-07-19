# BPNeuralNetwork

​			BP神经网络（Back Propagation Neural Network）是一种基于BP算法的人工神经网络，其使用BP算法进行权值与阈值的调整[78]。在20世纪80年代，几位不同的学者分别开发出了用于训练多层感知机的反向传播算法，David Rumelhart和James McClelland提出的反向传播算法是最具影响力的。其包含BP的两大主要过程，即工作信号的正向传播与误差信号的反向传播，分别负责了神经网络中输出的计算与权值和阈值更新。工作信号的正向传播是通过计算得到BP神经网络的实际输出，误差信号的反向传播是由后往前逐层修正权值与阈值，为了使实际输出更接近期望输出。

​       （1）工作信号正向传播。输入信号从输入层进入，通过突触进入隐含层神经元，经传递函数运算后，传递到输出层，并且在输出层计算出输出信号传出。当工作信号正向传播时，权值与阈值固定不变，神经网络中每层的状态只与前一层的净输出、权值和阈值有关。若正向传播在输出层获得到期望的输出，则学习结束，并保留当前的权值与阈值；若正向传播在输出层得不到期望的输出，则在误差信号的反向传播中修正权值与阈值。

​       （2）误差信号反向传播。在工作信号正向传播后若得不到期望的输出，则通过计算误差信号进行反向传播，通过计算BP神经网络的实际输出与期望输出之间的差值作为误差信号，并且由神经网络的输出层，逐层向输入层传播。在此过程中，每向前传播一层，就对该层的权值与阈值进行修改，由此一直向前传播直至输入层，该过程是为了使神经网络的结果与期望的结果更相近。

​       当进行一次正向传播和反向传播后，若误差仍不能达到要求，则该过程继续下去，直至误差满足精度，或者满足迭代次数等其他设置的结束条件。

## BPNN结构

该BPNN为单输入层单隐含层单输出层结构

激活函数使用Sigmoid函数

误差信号为:
$$
E=\frac{1}{2}\sum_{i=1}^{n}(d-o)^{^{2}}
$$

## 使用

1.创建一个`BPNeuralNetworkFactory`对象

```java
BPNeuralNetworkFactory factory = new BPNeuralNetworkFactory();
```

2.创建参数`BPParameter`对象

```java
BPParameter bpParameter = new BPParameter();
```

3.设置`BPParameter`参数

```java
bpParameter.setInputLayerNeuronNum(4);
bpParameter.setHiddenLayerNeuronNum(8);
bpParameter.setPrecision(0.01);
bpParameter.setMaxTimes(100000);
```

| 方法名称                  | 说明                 | 参数类型             | 默认值    |
| ------------------------- | -------------------- | -------------------- | --------- |
| `setInputLayerNeuronNum`  | 设置输入层神经元数目 | `int`                | 3         |
| `setHiddenLayerNeuronNum` | 设置隐含层神经元数目 | `int`                | 3         |
| `setOutputLayerNeuronNum` | 设置输出层神经元数目 | `int`                | 1         |
| `setNormalizationMin`     | 设置归一化区间下限   | `double`             | 0.2       |
| `setNormalizationMax`     | 设置归一化区间上限   | `double`             | 0.8       |
| `setStep`                 | 设置学习步长         | `double`             | 0.05      |
| `setMomentumFactor`       | 设置动量因子         | `double`             | 0.2       |
| `setActivationFunction`   | 设置激活函数         | `ActivationFunction` | `Sigmoid` |
| `setPrecision`            | 设置精度             | `double`             | 0.000001  |
| `setMaxTimes`             | 设置最大训练次数     | `int`                | 1000000   |

注：输入层与输出层神经元数目根据实际问题来决定

4.创建训练样本矩阵

```java
Matrix trainSet = new Matrix(trainArray);
```

注：`trainArray`为`double[][]`类型，包括`Input`与`Output`信息，Matrix详见[Matrix-Doc][1]

[1]: https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/Matrix/Matrix.md

5.训练BP神经网络

```java
BPModel bpModel = factory.trainBP(bpParameter, trainSet);
```

注：`BPModel`为BP神经网络训练出的模型，可使用`factory.serialize(bpModel, path)`方法将其序列化到本地，使用时通过`factory.deSerialization(path)`来反序列化，当然也可以存放到缓存中。

6.使用BP神经网络

```java
Matrix testSet = new Matrix(testArray);
Matrix result = factory.computeBP(bpModel, testSet);
```

注：`testArray`为`double[][]`类型，仅包括`Input`信息

`result`即为BP神经网络计算出的结果。

## 测试

使用了鸢尾花数据集对代码进行了测试

| 编号  | 测试参数                                                     | 测试结果                        | 准确率 | 时间 |
| ----- | ------------------------------------------------------------ | ------------------------------- | ------ | ---- |
| 测试1 | `inputLayerNeuronNum` : 4 `hiddenLayerNeuronNum` : 8 `precision` : 0.01 `maxTimes` : 100000 | 循环次数：100000，误差：0.0866  | 97.2%  | 24s  |
| 测试2 | `inputLayerNeuronNum` : 4 `hiddenLayerNeuronNum` : 8 `precision` : 0.01 `maxTimes` : 1000000 | 循环次数：1000000，误差：0.0162 | 93.1%  | 236s |
| 测试3 | `inputLayerNeuronNum` : 4 `hiddenLayerNeuronNum` : 5 `precision` : 0.01 `maxTimes` : 100000 | 循环次数：100000，误差：0.0868  | 97.2%  | 19s  |

为了取得效果较好的BP神经网络模型，需要通过多次训练，选择合适的隐含层神经元数目与训练次数。

[训练集][2]

[测试集][3]

[测试源码][4]

[2]:https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/bpnn/trainData.csv

[3]:https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/bpnn/testData.csv

[4]:https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/bpnn/TestBPNN.java

注：测试源码中使用了javacsv jar包，可直接从maven中引入

```xml
<dependency>
      <groupId>net.sourceforge.javacsv</groupId>
      <artifactId>javacsv</artifactId>
      <version>2.0</version>
</dependency>
```

