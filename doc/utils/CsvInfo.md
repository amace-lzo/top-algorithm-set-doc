# CsvInfo

csv实体类

[CsvInfo源码][1]

[1]: https://github.com/ineedahouse/top-algorithm-set/blob/dev/src/main/java/com/top/utils/CsvInfo.java

## 属性

| 属性名        | 类型                  | 说明        |
| ------------- | --------------------- | ----------- |
| `header`      | `String[]`            | csv头部     |
| `csvRowCount` | `int`                 | csv行数     |
| `csvColCount` | `int`                 | csv列数     |
| `csvFileList` | `ArrayList<String[]>` | csv内部数据 |

## 方法

| 方法名           | 说明         | 参数                  | 返回值                |
| ---------------- | ------------ | --------------------- | --------------------- |
| `getCsvColCount` | 获取csv列数  | -                     | `int`                 |
| `getCsvFileList` | 获取csv数据  | -                     | `ArrayList<String[]>` |
| `getCsvRowCount` | 获取csv行数  | -                     | `int`                 |
| `getHeader`      | 获取矩阵头部 | `double a`            | `String[]`            |
| `setCsvFileList` | 设置csv数据  | `ArrayList<String[]>` | `void`                |
| `setHeader`      | 设置矩阵头部 | `String[] header`     | `void`                |
| `toMatrix`       | 转成矩阵     | -                     | `Matrix`              |