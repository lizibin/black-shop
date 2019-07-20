
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
black-shop是基于Spring Cloud Alibaba微服务化电商平台，每个模块单独封装，各个模块之间通过Fegin调用，多业务系统并行开发，可以用来学习了解Spring Cloud各个组件的功能，了解电商的业务。 代码简洁，架构清晰，适合学习和直接项目中使用；核心技术采用Nacos、Sentinel、RocketMQ、Fegin、Ribbon、gateway、Security、Mybatis、Druid、Apollo、Redis、EFK、等主要框架和中间件， 后台管理采用开源框架vue-admin进行开发，前端采用Vue全家桶组件，欢迎Star、Watch、Fork。

项目采用springBoot-2.0.9和spring-cloud-alibaba-{latest.version}进行开发。

为 black-shop 贡献代码请参考 [如何贡献](https://github.com/lizibin/black-shop/wiki/%E5%A6%82%E4%BD%95%E8%B4%A1%E7%8C%AE%E4%BB%A3%E7%A0%81) 。

### 本地启动部署手册(未完待续~)

——[查看本地启动文档指南](https://github.com/lizibin/black-shop/wiki/%E6%9C%AC%E5%9C%B0%E5%90%AF%E5%8A%A8%E6%96%87%E6%A1%A3%E6%8C%87%E5%8D%97)

#### 欢迎参与该项目贡献和讨论  QQ群：204528889 <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=2a90a69143d4fb1075bcdb4992fa3255ad896ca20cadd634b5e01e4f49cf1d19"><img border="0" src="https://i.loli.net/2019/02/15/5c6691f5a7906.png" alt="black-shop(黑店)" title="black-shop(黑店)"></a>
![qun.png](https://i.loli.net/2019/02/15/5c668eda177f8.png)

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

**[Jenkins Pipeline](https://jenkins.io/doc/book/pipeline/)**：pipeline将我们原来意义上的手动配置每一个Jenkins Job的具体配置项变成将所有配置代码化, 并再次配合Gitlab等版本控制系统去保存我们的代码配置, 这样子无论Job在未来需要更新, 或者需要回滚到之前的某一个配置, 又或者一个新的Job需要参考之前的老Job的配置并直接套用, 又或者我们需要去批量生成若干个Job配置, 我们都可以像管理软件代码的方式去管理我们的Jenkins Job配置. 这样就极大的简化我们自动化部署的结构, 将以前需要手动配置Job的这个步骤, 直接代码化. 最终体现出我们DevOps的最终目标. 

**[kubernetes(k8s)](https://kubernetes.io/)**：kubernetes用于管理云平台中多个主机上的容器化的应用，Kubernetes的目标是让部署容器化的应用简单并且高效（powerful）,Kubernetes提供了应用部署，规划，更新，维护的一种机制，非常适合各种微服务的项目快速部署。

#### 项目架构图
![black-shop.png](https://i.loli.net/2019/03/21/5c93075604616.png)

#### 代码架构

```
|-black-shop   #黑店
|-  |-black-shop-auth   #oauth2.0认证服务
|-  |-black-shop-basic   #基础服务pom
|-  |-  |-black-shop-basic-apolloconfig   #阿波罗配置中心
|-  |-  |-black-shop-basic-elasticsearch   #elasticsearch搜索服务，对es服务器封装
|-  |-  |-black-shop-basic-redis   #redis缓存基础服务
|-  |-  |-black-shop-basic-scheduler   #任务调度
|-  |-  |-black-shop-basic-zipkin   #服务链路追踪
|-  |-black-shop-common   #公共服务
|-  |-  |-black-shop-common-bom  #集中管理版本号
|-  |-  |-black-shop-common-core  #公共核心
|-  |-  |-black-shop-common-data   #数据管理 
|-  |-  |-black-shop-common-data   #数据源 
|-  |-  |-black-shop-common-feign   #feignclient远程调用
|-  |-  |-black-shop-common-util   #公共工具服务   
|-  |-  |-black-shop-common-security  #spring security相关
|-  |-  |-black-shop-common-web  #和web相关的组件和工具类
|-  |-black-shop-porta   #门户模块
|-  |-  |-black-shop-porta-web   #前端web项目
|-  |-black-shop-gateway   #网关服务
|-  |-black-shop-service   #业务服务pom
|-  |-  |-black-shop-service-order   #订单服务
|-  |-  |-  |-black-shop-service-order-api   #订单服务Api
|-  |-  |-  |-black-shop-service-order-service   #订单服务实现
|-  |-  |-black-shop-service-payment   #支付服务
|-  |-  |-  |-black-shop-service-payment-api   #支付服务Api
|-  |-  |-  |-black-shop-service-payment-service   #支付服务实现
|-  |-  |-black-shop-service-product   #商品服务
|-  |-  |-  |-black-shop-service-product-api   #商品服务Api
|-  |-  |-  |-black-shop-service-product-service   #商品服务实现
|-  |-  |-black-shop-service-search   #搜索服务
|-  |-  |-  |-black-shop-service-search-api   #搜索服务Api
|-  |-  |-  |-black-shop-service-search-service   #搜索服务实现
|-  |-  |-black-shop-service-shoppingcart   #购物车服务
|-  |-  |-  |-black-shop-service-shoppingcart-api   #购物车服务Api
|-  |-  |-  |-black-shop-service-shoppingcart-service   #购物车服务实现
|-  |-  |-black-shop-service-thirdpart   #第三方服务
|-  |-  |-  |-black-shop-service-wechat   #微信服务
|-  |-  |-  |-  |-black-shop-service-wechat-api   微信服务Api
|-  |-  |-  |-  |-black-shop-service-wechat-service   #微信服务实现

```
