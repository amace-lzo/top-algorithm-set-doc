# Matrix

矩阵实体类  
[Matrix源码][1]

[1]: https://github.com/ineedahouse/top-algorithm-set/blob/dev/src/main/java/com/top/matrix/Matrix.java

## 属性

| 属性名           | 类型         | 说明                   |
| ---------------- | ------------ | ---------------------- |
| `header`         | `double[][]` | 以二维数组存放矩阵数据 |
| `matrixColCount` | `int`        | 矩阵列数               |
| `matrixRowCount` | `int`        | 矩阵行数               |

## 构造函数

| 构造函数名称 | 说明                                             | 参数                                     |
| ------------ | ------------------------------------------------ | ---------------------------------------- |
| `Matrix`     | 生成一个空矩阵                                   | -                                        |
| `Matrix`     | 生成一个指定数据的矩阵                           | `double[][] matrix`                      |
| `Matrix`     | 生成一个`rowCount行`colCount`列，值为`0`的矩阵   | `int rowCount, int colCount`             |
| `Matrix`     | 生成一个`rowCount行`colCount`列，值为`val`的矩阵 | `double val, int rowCount, int colCount` |

## 方法

| 方法名              | 说明                               | 参数                                                         | 返回值       |
| ------------------- | ---------------------------------- | ------------------------------------------------------------ | ------------ |
| `divide`            | 矩阵除一个数字                     | `double a`                                                   | `Matrix`     |
| `extend`            | 扩展矩阵                           | `int direction(1横向,2纵向) , int a`                         | `Matrix`     |
| `getColAvg`         | 获取每列的平均值                   | -                                                            | `Matrix`     |
| `getColOfIdx`       | 获取第y列                          | `int y`                                                      | `Matrix`     |
| `getCovariance`     | 获取协方差矩阵                     | -                                                            | `Matrix`     |
| `getMatrix`         | 获取矩阵                           | -                                                            | `double[][]` |
| `getMatrixColCount` | 获取矩阵的列数                     | -                                                            | `int`        |
| `getMatrixRowCount` | 获取矩阵的行数                     | -                                                            | `int`        |
| `getRowOfIdx`       | 获取第x行                          | `int x`                                                      | `Matrix`     |
| `getValOfIdx`       | 获取矩阵第x行第y列的值             | `int x, int y`                                               | `double`     |
| `multiple`          | 乘矩阵                             | `Matrix a`                                                   | `Matrix`     |
| `multiple`          | 矩阵中所有的值全部乘double类型的数 | `double a`                                                   | `Matrix`     |
| `plus`              | 矩阵加一个数字                     | `double a`                                                   | `Matrix`     |
| `plus`              | 矩阵相加                           | `Matrix a`                                                   | `Matrix`     |
| `pointMultiple`     | 点乘矩阵                           | `Matrix a`                                                   | `Matrix`     |
| `setMatrix`         | 设置矩阵的值                       | `double[][] matrix`                                          | -            |
| `subMatrix`         | 截取矩阵                           | `int startRowIndex`,`int rowNums`,`int startColIndex`,`int colNums` | `Matrix`     |
| `subtract`          | 矩阵减一个数字                     | `double a`                                                   | `Matrix`     |
| `subtract`          | 矩阵相减                           | `Matrix a`                                                   | `Matrix`     |
| `sumRow`            | 合计每一行的值                     | -                                                            | `Matrix`     |
| `sumCol`            | 合计每一列的值                     | -                                                            | `Matrix`     |
| `sumAll`            | 合计矩阵中所有数的值               | -                                                            | `double`     |
| `splice`            | 矩阵合并                           | `int direction(1横向,2纵向), Matrix a`                       | `Matrix`     |
| `square`            | 矩阵中所有值全部进行平方           | -                                                            | `Matrix`     |
| `transpose`         | 矩阵转置                           | -                                                            | `Matrix`     |

_注:_

由于项目引用了Jama包，所以在import矩阵Matrix类时需要注意，应`import com.top.matrix.Matrix`

