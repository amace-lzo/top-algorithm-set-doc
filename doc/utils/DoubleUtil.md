#  SerializationUtilDoubleUtil 

Double工具类

[DoubleUtil源码][1]

[1]: https://github.com/ineedahouse/top-algorithm-set/blob/dev/src/main/java/com/top/utils/DoubleUtil.java

## 方法

| 方法名   | 说明                             | 参数                                 | 返回值    |
| -------- | -------------------------------- | ------------------------------------ | --------- |
| `equals` | 两Double对象进行比较             | `Double a, Double b`                 | `boolean` |
| `equals` | 两Double对象进行比较，自定义误差 | `Double a, Double b,Double maxError` | `boolean` |

### equals

参数说明：

- `a`:待比较数
- `b`:待比较数
- `maxError`:允许最大误差，默认` 0.0001
