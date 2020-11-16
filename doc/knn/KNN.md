# KNN（K-近邻）

 KNN是一种分类方法，该方法的思路非常简单直观：如果一个样本在特征空间中的K个最相似（即特征空间中最邻近）的样本中的大多数属于某一个类别，则该样本也属于这个类别。该方法在定类决策上只依据最邻近的一个或者几个样本的类别来决定待分样本所属的类别 。

 KNN算法的核心思想是，如果一个样本在特征空间中的K个最相邻的样本中的大多数属于某一个类别，则该样本也属于这个类别，并具有这个类别上样本的特性。该方法在确定分类决策上只依据最邻近的一个或者几个样本的类别来决定待分样本所属的类别。KNN方法在类别决策时，只与极少量的相邻样本有关。由于KNN方法主要靠周围有限的邻近的样本，而不是靠判别类域的方法来确定所属类别的，因此对于类域的交叉或重叠较多的待分样本集来说，KNN方法较其他方法更为适合 

## KNN算法流程

总体来说，KNN分类算法包括以下4个步骤：

①准备数据，对数据进行预处理 。

②计算测试样本点（也就是待分类点）到其他每个样本点的距离。

③对每个距离进行排序，然后选择出距离最小的K个点 。

④对K个点所属的类别进行比较，根据少数服从多数的原则，将测试样本点归入在K个点中占比最高的那一类 。

## 使用

1.获取训练数据及待分类数据的Matrix对象（略）

2.使用KNN进行分类

```java
Matrix result = KNN.classify(testSetData, trainSetData, trainSetLabels, 5);
```

KNN分类方法参数说明：

```
Matrix classify(Matrix input, Matrix dataSet, Matrix labels, int k)
```

- input  待分类数据
- dataSet 训练数据集（不包含标签）
- labels 训练数据集标签
- k 根据最近的k个样本来确定待分类数据的类别

## 测试

使用了鸢尾花数据集对代码进行了测试（各运行5次取平均值）

| 编号  | 测试参数 | 准确率 | 平均时间 |
| ----- | -------- | ------ | -------- |
| 测试1 | `k`:2    | 97.2%  | 22ms     |
| 测试2 | `k`:5    | 98.6%  | 21ms     |
| 测试3 | `k`:10   | 97.2%  | 18.6ms   |

[训练集][2]

[测试集][3]

[测试源码][4]

[2]:https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/knn/trainData.csv

[3]:https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/knn/testData.csv

[4]:https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/knn/knnTest.java



