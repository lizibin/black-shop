use mysql;
select host, user from user;
-- 这一条命令一定要有：
grant all PRIVILEGES on *.* to root@'%' WITH GRANT OPTION;
flush privileges;
