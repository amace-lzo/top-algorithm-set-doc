#  SerializationUtil 

序列化工具类

[SerializationUtil源码][1]

[1]: https://github.com/ineedahouse/top-algorithm-set/blob/dev/src/main/java/com/top/utils/SerializationUtil.java

## 方法

| 方法名            | 说明             | 参数                         | 返回值   |
| ----------------- | ---------------- | ---------------------------- | -------- |
| `serialize`       | 对象序列化到本地 | `Object object, String path` | `void`   |
| `deSerialization` | 对象反序列化     | `String path`                | `Object` |

### serialize

参数说明：

- `object`:待序列化的对象
- `path`:对象序列化的路径

### deSerialization

参数说明：

- `path`:反序列化的路径

