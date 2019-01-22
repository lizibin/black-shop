
<p align="center">
     <img src="https://i.loli.net/2019/01/09/5c35d32d1d16f.png" alt="black-shop-logo" width="25%">
    <h3 align="center">Black-Shop</h3>
    <p align="center">
        black-shop, microservice B2C e-commerce platform.
        <br>
        <a href="https://github.com/lizibin/black-shop"><strong>-- Home Page --</strong></a>
        <br>
        <br>
       <a href="https://travis-ci.org/lizibin/black-shop">
            <img src="https://travis-ci.org/lizibin/black-shop.svg?branch=master" >
        </a>
         <a href="https://www.apache.org/licenses/LICENSE-2.0.html">
             <img src="https://img.shields.io/badge/license-apache2.0-000000.svg" >       
         </a>
    </p>    
</p>



## black-shop（黑店） for spring cloud Alibaba

# 项目介绍(开发中，欢迎加入~)
black-shop是基于Spring Cloud Alibaba微服务化电商平台，每个模块单独封装，各个模块之间通过Fegin调用，多业务系统并行开发，可以用来学习了解Spring Cloud各个组件的功能，了解电商的业务。 代码简洁，架构清晰，适合学习和直接项目中使用；核心技术采用Nacos、Sentinel、RocketMQ、Fegin、Ribbon、getway、Security、Mybatis、Druid、Apollo、Redis、EFK、等主要框架和中间件， 后台管理采用开源框架vue-admin进行开发，前端采用Vue全家桶组件，欢迎Star、Watch、Fork。

项目采用springBoot-2.0.4和spring-cloud-alibaba-{latest.version}进行开发。

### 本地启动部署手册(未完待续~)

——[查看本地启动部署手册](https://github.com/lizibin/black-shop/tree/master/doc)

#### 欢迎参与该项目贡献和讨论  QQ群：204528889
![qun.png](https://i.loli.net/2019/01/08/5c3485faed740.png)

## 开发组件~

**[Nacos(~~Eureka~~)](https://github.com/alibaba/Nacos)**：替换Eureka，nacos是一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台。

**[Sentinel(~~Hystrix~~)](https://github.com/alibaba/Sentinel)**：替换Hystrix，把流量作为切入点，从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性。

**[RocketMQ](https://rocketmq.apache.org/)**：一款开源的分布式消息系统，基于高可用分布式集群技术，提供低延时的、高可靠的消息发布与订阅服务。

**[Apollo(~~SpringCloud Config~~)](https://github.com/ctripcorp/apollo)**：替换SpringCloud Config，apollo能够集中化管理应用不同环境、不同集群的配置，配置修改后能够实时推送到应用端，并且具备规范的权限、流程治理等特性，适用于微服务配置管理场景。

**[SpringCloud Gateway(~~Zuul~~)](https://spring.io/projects/spring-cloud-gateway)**：替换Zuul，Spring Cloud Gateway作为Spring Cloud生态系中的网关，目标是替代Netflix ZUUL，其不仅提供统一的路由方式，并且基于Filter链的方式提供了网关基本的功能，例如：安全，监控/埋点，和限流等。

## 部署组件~(全部组件采用docker|docker-compose|pod 进行部署)~

**[Docker](https://www.docker.com/)**：Docker 是一个开源的应用容器引擎，让开发者可以打包他们的应用以及依赖包到一个可移植的容器中，然后发布到任何流行的 Linux 机器上，也可以实现虚拟化。容器是完全使用沙箱机制，相互之间不会有任何接口。

**[Harbor](https://www.docker.com/)**：Harbor是一个用于存储和分发Docker镜像的企业级Registry服务器，用来做镜像的存储。

**[Jenkins](https://jenkins.io/)**：Jenkins是基于Java开发的一种持续集成工具，用于监控持续重复的工作，旨在提供一个开放易用的软件平台，使软件的持续集成变成可能。

**[kubernetes(k8s)](https://kubernetes.io/)**：kubernetes用于管理云平台中多个主机上的容器化的应用，Kubernetes的目标是让部署容器化的应用简单并且高效（powerful）,Kubernetes提供了应用部署，规划，更新，维护的一种机制，非常适合各种微服务的项目快速部署。

#### 项目架构图
正在抓紧时间画………………客观稍安勿躁。

#### 软件架构

```
|-black-shop   #黑店
|-  |-black-shop-basic   #基础组件
|-  |-  |-black-shop-basic-apolloconfig   #阿波罗配置中心
|-  |-  |-black-shop-basic-elasticsearch   #elasticsearch搜索服务，对es服务器封装
|-  |-  |-black-shop-basic-redis   #redis缓存基础服务
|-  |-  |-black-shop-basic-scheduler   #任务调度
|-  |-  |-black-shop-basic-zipkin   #服务链路追踪
|-  |-  |-black-shop-basic-gateway   #服务网关
|-  |-  |-black-shop-basic-nacos   #nacos的demo
|-  |-black-shop-common   #公共服务
|-  |-  |-black-shop-common-basic  #公共基础服务
|-  |-  |-black-shop-common-util   #公共工具服务   
|-  |-black-shop-model   #实体模块
|-  |-  |-black-shop-model-user  #用户实体
|-  |-  |-black-shop-model-order   #订单实体 
|-  |-  |-black-shop-model-product   #商品实体 
|-  |-black-shop-service-api   #业务服务接口api
|-  |-  |-black-shop-service-api-user   #用户服务接口
|-  |-  |-  |-black-shop-service-api-user-security   #用户服务安全框架暴露接口
|-  |-  |-black-shop-service-api-serach   #搜索服务接口
|-  |-  |-  |-black-shop-service-api-serach-product   #商品搜索服务暴露接口
|-  |-  |-black-shop-service-api-product   #商品服务接口
|-  |-  |-  |-black-shop-service-api-product-basic   #商品服务暴露接口
|-  |-  |-black-shop-service-api-order   #订单服务接口
|-  |-  |-  |-black-shop-service-api-product-basic   #订单服务暴露接口
|-  |-black-shop-service   #服务实现
|-  |-  |-black-shop-service-user   #用户服务实现
|-  |-  |-  |-black-shop-service-user-basic   #用户基础服务实现
|-  |-  |-  |-black-shop-service-user-security   #用户安全框架实现
|-  |-  |-black-shop-service-serach   #搜索服务
|-  |-  |-  |-black-shop-service-serach-product   #商品搜索服务实现
|-  |-  |-black-shop-service-product   #商品服务
|-  |-  |-  |-black-shop-service-product-basic   #商品基础服务实现
|-  |-  |-black-shop-service-order   #订单服务
|-  |-  |-  |-black-shop-service-order-basic   #订单基础服务实现
|-  |-  |-black-shop-service-payment   #支付服务
|-  |-  |-  |-black-shop-service-payment-basic   #支付基础服务实现


```

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request
