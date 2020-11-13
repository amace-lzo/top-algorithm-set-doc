#  MatrixUtil 

Matrix工具类

[MatrixUtil 源码][1]

[1]: https://github.com/ineedahouse/top-algorithm-set/blob/dev/src/main/java/com/top/utils/MatrixUtil.java

## 方法

| 方法名               | 说明                 | 参数                                                         | 返回值                |
| -------------------- | -------------------- | ------------------------------------------------------------ | --------------------- |
| `eye`                | 创建一个单位矩阵     | `int matrixRowCount（矩阵的行数）`                           | `Matrix`              |
| `inv`                | 求矩阵的逆           | `Matrix a`                                                   | `Matrix`              |
| `adj`                | 求伴随矩阵           | `Matrix a`                                                   | `Matrix`              |
| `getTopTriangle`     | 将矩阵转成上三角矩阵 | `Matrix a`                                                   | `Matrix`              |
| `cov`                | 取矩阵协方差         | `Matrix a`                                                   | `Matrix`              |
| `invable`            | 判断矩阵是否可逆     | `Matrix a`                                                   | `boolean`             |
| `getV`               | 求矩阵特征矩阵       | `Matrix a`                                                   | `Matrix`              |
| `getRealEigenvalues` | 求特征值的实部       | `Matrix a`                                                   | `double[]`            |
| `getImagEigenvalues` | 求特征值虚部         | `Matrix a`                                                   | `double[]`            |
| `getD`               | 取块对角特征矩阵     | `Matrix a`                                                   | `Matrix`              |
| `normalize`          | 数据归一化           | `Matrix a, double normalizationMin, double normalizationMax` | `Map<String, Object>` |
| `inverseNormalize`   | 数据反归一化         | `Matrix a, double normalizationMax, double normalizationMin , Matrix dataMax,Matrix dataMin` | `Matrix`              |

### normalize

参数说明：

- `a`:待归一化的矩阵
- `normalizationMin`:归一化区间下限
- `normalizationMax`:归一化区间上限

返回值：

`Map<String,Object>`中含有三个键值对

- `Matrix max`:最大值矩阵
- `Matrix min`:最小值矩阵
- `Matrix res`:归一化后的结果矩阵

### createCsvFile

参数说明：

- `a`:待反归一化的矩阵
- `normalizationMax`:反归一化上限
- `normalizationMin `:反归一下下限
- `dataMax`:归一化时取得的最大值矩阵
- `dataMin`:归一化时取得的最小值矩阵

