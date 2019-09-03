use mysql;
select host, user from user;
-- 因为mysql版本是5.6，因此新建用户为如下命令：
--create user legendshop_sr1 identified by 'legendshop_sr1123';
-- 将docker_mysql数据库的权限授权给创建的docker用户，密码为123456：
--grant all on legendshop_dev.* to legendshop_sr1@'%' identified by 'legendshop_sr1123' with grant option;
-- 这一条命令一定要有：
grant all PRIVILEGES on *.* to root@'%' WITH GRANT OPTION;
flush privileges;
