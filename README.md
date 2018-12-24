# black-shop（黑店）

#### 项目介绍
black-shop是基于Spring Cloud微服务化电商平台，每个模块单独封装，各个模块之间通过Fegin调用，多业务系统并行开发，可以用来学习了解Spring Cloud各个组件的功能，了解电商的业务。 代码简洁，架构清晰，适合学习和直接项目中使用；核心技术采用Eureka、Fegin、Ribbon、getway、Hystrix、Security、Mybatis、Druid、Apollo、Redis、EFK、Rocketmq等主要框架和中间件， 后台管理采用开源框架vue-admin进行开发，前端采用Vue全家桶组件，欢迎Star、Watch、Fork。

项目采用springBoot-2.0.7和springcloud-Finchley.SR2进行开发。

#### 欢迎参与该项目贡献和讨论  QQ群：204528889

#### 项目架构图
正在画………………

#### 软件架构

```
|-black-shop   #黑店
|-  |-black-shop-parent   #公共依赖  
|-  |-  |-black-shop-basic   #基础组件
|-  |-  |-  |-black-shop-basic-springcloud-apollo   #阿波罗
|-  |-  |-  |-black-shop-basic-springcloud-eureka   #注册中心
|-  |-  |-black-shop-common   #公共服务
|-  |-  |-  |-black-shop-common-basic  #公共基础服务
|-  |-  |-  |-black-shop-common-util   #公共工具服务   
|-  |-  |-black-shop-service-api   #业务服务保罗接口
|-  |-  |-  |-black-shop-service-api-user   #用户服务接口
|-  |-  |-  |-  |-black-shop-service-api-user-security   #用户服务安全框架暴露接口
|-  |-  |-  |-black-shop-service-api-serach   #搜索服务接口
|-  |-  |-  |-  |-black-shop-service-api-serach-prod   #商品搜索暴露接口
|-  |-  |-  |-black-shop-service-api-prod   #商品服务接口
|-  |-  |-  |-  |-black-shop-service-api-prod-basic   #商品暴露接口
|-  |-  |-black-shop-service   #服务实现
|-  |-  |-  |-black-shop-service-user   #用户服务实现
|-  |-  |-  |-  |-black-shop-service-user-basic   #用户基础服务实现
|-  |-  |-  |-  |-black-shop-service-user-oauth   #用户认证授权服务实现
|-  |-  |-  |-  |-black-shop-service-user-sso   #用户单点登录服务实现
|-  |-  |-  |-  |-black-shop-service-user-security   #用户安全框架实现
|-  |-  |-  |-black-shop-service-serach   #搜索服务
|-  |-  |-  |-  |-black-shop-service-serach-prod   #商品搜索服务实现
|-  |-  |-  |-black-shop-service-prod   #商品服务
|-  |-  |-  |-  |-black-shop-service-prod-basic   #商品基础服务实现
|-  |-black-shop-admin
|-  |-black-shop-apollo


```

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request

