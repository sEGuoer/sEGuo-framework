# 各种错误
## 连接数据库密码错误

1. ![image_720.png](..%2F..%2F..%2F..%2F..%2F..%2FAppData%2FLocal%2FTemp%2Fimage_720.png)
[DataSourceConfig.java](..%2Fcom%2FsEGuo%2Fmybatis%2FConfig%2FDataSourceConfig.java)

解决方案，如果sql数据库密码为空，设置时就不设置密码，如果设置的话就会报如图的错