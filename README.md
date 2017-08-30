# Spring Cloud Config Server
> 基于springcloud搭建的高可用配置中心


## 使用技术
- 版本：springcloud Camden.SR6

## 项目结构
- 服务发现 discovery
- 配置中心服务端 configserver
- 应用客户端 configclient

## 启动项目
1. 启动discovery
java -jar discovery-1.0-SNAPSHOT.jar --spring.profiles.active=eureka1
java -jar discovery-1.0-SNAPSHOT.jar --spring.profiles.active=eureka2
2. 启动configserver
java -jar configserver-0.0.1-SNAPSHOT.jar --spring.profiles.active=server1
java -jar configserver-0.0.1-SNAPSHOT.jar --spring.profiles.active=server2
3. 启动configclient
java -jar configclient-0.0.1-SNAPSHOT.jar --spring.profiles.active=client1

## 实现功能
高可用configserver微服务进行统一配置管理，支持动态更新；
配置数据存储方式：Git、SVN、File存储
