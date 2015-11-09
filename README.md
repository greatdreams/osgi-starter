#### 项目名称

osgi-starter

#### 项目简述

使用gradle建立工具创建一个OSGI初始化工程。

#### 编译、运行

```

$./gradlew :producer:install
$./gradlew :consumer:install

```
#### 安装karaf 

karaf 官网： http://karaf.apache.org/

####执行karaf命令

```

karaf<root>(bundle): bundle:install mvn:com.greatdreams.osgi.demo/produce/0.0.1
karaf<root>(bundle): bundle:install mvn:com.greatdreams.osgi.demo/consumer/0.0.1

```