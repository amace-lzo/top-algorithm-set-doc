#  CsvUtil 

csv工具类

[CsvUtil源码][1]

[1]: https://github.com/ineedahouse/top-algorithm-set/blob/dev/src/main/java/com/top/utils/CsvUtil.java

## 方法

| 方法名          | 说明                  | 参数                                      | 返回值    |
| --------------- | --------------------- | ----------------------------------------- | --------- |
| `getCsvInfo`    | 获取CSV中的信息       | `boolean hasHeader , String path`         | [`CsvInfo`][1] |
| `createCsvFile` | 将矩阵写入到csv文件中 | `String[] header,Matrix data,String path` | `void`    |

### getCsvInfo

参数说明：

- `hasHeader`:CSV中是否包含头
- `path`:CSV所在路径

### createCsvFile

参数说明：

- `header`:要写入的csv头部
- `data`:待填充的数据矩阵
- `path`:文件输出位置

[1]: https://github.com/ineedahouse/top-algorithm-set-doc/blob/master/doc/utils/CsvInfo.md
