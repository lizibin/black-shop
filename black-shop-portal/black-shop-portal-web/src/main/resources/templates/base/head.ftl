<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>黑店-首页</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="../res/layui/css/layui.css">
  <link rel="stylesheet" href="../res/static/css/index.css">
</head>
<body>

<div class="house-header">
  <div class="layui-container">
    <div class="house-nav">
      <span class="layui-breadcrumb" lay-separator="|">
     <#if desensMobile??>
         <a href="">${desensMobile}</a>
       <a href="">我的订单</a>
       <a href="/exit">退出</a>
      <#else >
          <a href="login">登录</a>
     </#if>
     
        <a href="http://wpa.qq.com/msgrd?v=3&uin=483966038&site=qq&menu=yes">在线客服</a>
      </span>
      <span class="layui-breadcrumb house-breadcrumb-icon" lay-separator=" ">
        <a id="search"><i class="layui-icon layui-icon-house-find"></i></a>
        <a href="login.html"><i class="layui-icon layui-icon-username"></i></a>
        <a href="usershop.html"><i class="layui-icon layui-icon-house-shop"></i></a>
      </span>
    </div> 
    <div class="house-banner layui-form">
      <a class="banner" href="index.html">
        <img src="http://static.itmayiedu.com/12312312312312da.png" alt="家居商城">
      </a>
      <div class="layui-input-inline">
        <input type="text" placeholder="搜索商品" class="layui-input"><i class="layui-icon layui-icon-house-find"></i>
      </div>
      <a class="shop" href="usershop.html"><i class="layui-icon layui-icon-house-shop"></i><span class="layui-badge">1</span></a>
    </div>
    <ul class="layui-nav close">
      <li class="layui-nav-item layui-this"><a href="index.html">首页</a></li>
      <li class="layui-nav-item"><a href="list.html">居家用品</a></li>
      <li class="layui-nav-item"><a href="list.html">小家电</a></li>
      <li class="layui-nav-item"><a href="list.html">洗护</a></li>
      <li class="layui-nav-item"><a href="list.html">厨具</a></li>
      <li class="layui-nav-item"><a href="list.html">日用品</a></li>
    </ul>
    <button id="switch">
      <span></span><span class="second"></span><span class="third"></span>
    </button>
  </div>
</div>