# Matrix

矩阵实体类

## 属性

| 属性名          | 类型         | 说明                   |
| --------------- | ------------ | ---------------------- |
| `matrix`        | `double[][]` | 以二维数组存放矩阵数据 |
| `matrixColNums` | `int`        | 矩阵列数               |
| `matrixRowNums` | `int`        | 矩阵行数               |

## 构造函数

| 构造函数名称 | 说明                                            | 参数                                   |
| ------------ | ----------------------------------------------- | -------------------------------------- |
| `Matrix`     | 生成一个空矩阵                                  | -                                      |
| `Matrix`     | 生成一个指定数据的矩阵                          | `double[][] matrix`                    |
| `Matrix`     | 生成一个`rowNums`行`colNums`列，值为`0`的矩阵   | `int rowNums, int colNums`             |
| `Matrix`     | 生成一个`rowNums`行`colNums`列，值为`val`的矩阵 | `double val, int rowNums, int colNums` |

## 方法

| 方法名             | 说明                               | 参数                | 返回值       |
| ------------------ | ---------------------------------- | ------------------- | ------------ |
| `getMatrix`        | 获取矩阵                           | -                   | `double[][]` |
| `getMatrixColNums` | 获取矩阵的列数                     | -                   | `int`        |
| `getMatrixRowNums` | 获取矩阵的行数                     | -                   | `int`        |
| `getValOfIdx`      | 获取矩阵第x行第y列的值             | `int x, int y`      | `double`     |
| `getRowOfIdx`      | 获取第x行                          | `int x`             | `Matrix`     |
| `getColOfIdx`      | 获取第y列                          | `int y`             | `Matrix`     |
| `setMatrix`        | 设置矩阵的值                       | `double[][] matrix` | -            |
| `multiple`         | 乘矩阵                             | `Matrix a`          | `Matrix`     |
| `multiple`         | 矩阵中所有的值全部乘double类型的数 | `double a`          | `Matrix`     |
| `pointMultiple`    | 点乘矩阵                           | `Matrix a`          | `Matrix`     |
| `plus`             | 矩阵相加                           | `Matrix a`          | `Matrix`     |
| `subtract`         | 矩阵相减                           | `Matrix a`          | `Matrix`     |
| `sumRow`           | 合计每一行的值                     | -                   | `Matrix`     |
| `sumCol`           | 合计每一列的值                     | -                   | `Matrix`     |
| `sumAll`           | 合计矩阵中所有数的值               | -                   | `double`     |
| `square`           | 矩阵中所有值全部进行平方           | -                   | `Matrix`     |
| `transpose`        | 矩阵转置                           | -                   | `Matrix`     |

