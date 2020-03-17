/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.6.47 : Database - blackshop_user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blackshop_user` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `blackshop_user`;

/*Table structure for table `bs_oauth_details` */

DROP TABLE IF EXISTS `bs_oauth_details`;

CREATE TABLE `bs_oauth_details` (
  `client_id` varchar(32) NOT NULL,
  `resource_ids` varchar(256) DEFAULT NULL,
  `client_secret` varchar(256) DEFAULT NULL,
  `scope` varchar(256) DEFAULT NULL,
  `authorized_grant_types` varchar(256) DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) DEFAULT NULL,
  `authorities` varchar(256) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `autoapprove` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='终端信息表';

/*Data for the table `bs_oauth_details` */

insert  into `bs_oauth_details`(`client_id`,`resource_ids`,`client_secret`,`scope`,`authorized_grant_types`,`web_server_redirect_uri`,`authorities`,`access_token_validity`,`refresh_token_validity`,`additional_information`,`autoapprove`) values 
('app',NULL,'app','server','password,refresh_token',NULL,NULL,NULL,NULL,NULL,'true'),
('blackshop',NULL,'blackshop@123','server','password,refresh_token,authorization_code,client_credentials','http://localhost:4040/sso1/login,http://localhost:4041/sso1/login',NULL,NULL,NULL,NULL,'true'),
('test',NULL,'test','server','password,refresh_token',NULL,NULL,NULL,NULL,NULL,'true');

/*Table structure for table `bs_sys_menu` */

DROP TABLE IF EXISTS `bs_sys_menu`;

CREATE TABLE `bs_sys_menu` (
  `menu_id` int(11) unsigned NOT NULL COMMENT '菜单id',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `permission` varchar(50) DEFAULT NULL COMMENT '权限名称',
  `url` varchar(128) DEFAULT NULL COMMENT '权限url',
  `parent_id` int(11) DEFAULT NULL COMMENT '父节点id',
  `icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `sort` int(11) DEFAULT NULL COMMENT '排序值',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bs_sys_menu` */

insert  into `bs_sys_menu`(`menu_id`,`name`,`permission`,`url`,`parent_id`,`icon`,`create_time`,`update_time`,`sort`) values 
(1,'用户管理',NULL,'/user',-1,NULL,'2019-10-31 00:08:23','2019-10-31 00:08:25',1);

/*Table structure for table `bs_sys_role` */

DROP TABLE IF EXISTS `bs_sys_role`;

CREATE TABLE `bs_sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(64) COLLATE utf8mb4_bin NOT NULL,
  `role_code` varchar(64) COLLATE utf8mb4_bin NOT NULL,
  `role_desc` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `ds_type` char(1) COLLATE utf8mb4_bin NOT NULL DEFAULT '2' COMMENT '数据权限类型',
  `ds_scope` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '数据权限范围',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `del_flag` char(1) COLLATE utf8mb4_bin DEFAULT '0' COMMENT '删除标识（0-正常,1-删除）',
  PRIMARY KEY (`role_id`) USING BTREE,
  KEY `role_idx1_role_code` (`role_code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC COMMENT='系统角色表';

/*Data for the table `bs_sys_role` */

insert  into `bs_sys_role`(`role_id`,`role_name`,`role_code`,`role_desc`,`ds_type`,`ds_scope`,`create_time`,`update_time`,`del_flag`) values 
(1,'管理员','ROLE_ADMIN','管理员','0','2','2019-10-01 22:37:27','2019-11-11 22:37:32','0');

/*Table structure for table `bs_sys_role_menu` */

DROP TABLE IF EXISTS `bs_sys_role_menu`;

CREATE TABLE `bs_sys_role_menu` (
  `role_id` int(11) unsigned NOT NULL COMMENT '角色id',
  `menu_id` int(11) NOT NULL COMMENT '菜单id',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bs_sys_role_menu` */

insert  into `bs_sys_role_menu`(`role_id`,`menu_id`) values 
(1,1);

/*Table structure for table `bs_sys_user` */

DROP TABLE IF EXISTS `bs_sys_user`;

CREATE TABLE `bs_sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `phone_number` varchar(100) DEFAULT NULL COMMENT '手机号',
  `status` int(1) DEFAULT NULL COMMENT '0：禁用   1：正常',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统用户';

/*Data for the table `bs_sys_user` */

insert  into `bs_sys_user`(`user_id`,`username`,`password`,`avatar`,`email`,`phone_number`,`status`,`create_time`,`update_time`) values 
(1,'admin','$2a$10$WhCuqmyCsYdqtJvM0/J4seCU.xZQHe2snNE5VFUuBGUZWPbtdl3GG',NULL,'125720240@qq.com','1317571157',1,'2019-07-20 10:05:09',NULL);

/*Table structure for table `bs_sys_user_role` */

DROP TABLE IF EXISTS `bs_sys_user_role`;

CREATE TABLE `bs_sys_user_role` (
  `user_id` int(11) unsigned NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `bs_sys_user_role` */

insert  into `bs_sys_user_role`(`user_id`,`role_id`) values 
(1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
