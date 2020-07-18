# Matrix

矩阵实体类

| 方法名             | 说明                               | 参数           | 返回值       |
| ------------------ | ---------------------------------- | -------------- | ------------ |
| `getMatrix`        | 获取矩阵                           | -              | `double[][]` |
| `getMatrixColNums` | 获取矩阵的列数                     | -              | `int`        |
| `getMatrixRowNums` | 获取矩阵的行数                     | -              | `int`        |
| `getValOfIdx`      | 获取矩阵第x行第y列的值             | `int x, int y` | `double`     |
| `getRowOfIdx`      | 获取第x行                          | `int x`        | `Matrix`     |
| `getColOfIdx`      | 获取第y列                          | `int y`        | `Matrix`     |
| `multiple`         | 乘矩阵                             | `Matrix a`     | `Matrix`     |
| `multiple`         | 矩阵中所有的值全部乘double类型的数 | `double a`     | `Matrix`     |
| `pointMultiple`    | 点乘矩阵                           | `Matrix a`     | `Matrix`     |
| `plus`             | 矩阵相加                           | `Matrix a`     | `Matrix`     |
| `subtract`         | 矩阵相减                           | `Matrix a`     | `Matrix`     |
| `sumRow`           | 合计每一行的值                     | -              | `Matrix`     |
| `sumCol`           | 合计每一列的值                     | -              | `Matrix`     |
| `sumAll`           | 合计矩阵中所有数的值               | -              | `double`     |
| `square`           | 矩阵中所有值全部进行平方           | -              | `Matrix`     |
| `transpose`        | 矩阵转置                           | -              | `Matrix`     |

## Next Step
下个版本会新增矩阵截取方法，并完善矩阵加减乘除等运算方法。
