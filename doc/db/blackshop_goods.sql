/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 8.0.18 : Database - blackshop_goods
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blackshop_goods` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `blackshop_goods`;

/*Table structure for table `bs_category` */

DROP TABLE IF EXISTS `bs_category`;

CREATE TABLE `bs_category` (
  `id` int(11) unsigned NOT NULL COMMENT '主键id',
  `category_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `parentId` int(11) DEFAULT NULL COMMENT '父类id，为0则为顶级',
  `icon` varchar(255) DEFAULT NULL COMMENT '分类图标',
  `level` int(11) DEFAULT NULL COMMENT '分类层级',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bs_category` */

/*Table structure for table `bs_goods` */

DROP TABLE IF EXISTS `bs_goods`;

CREATE TABLE `bs_goods` (
  `id` int(11) unsigned NOT NULL COMMENT '主键id',
  `goods_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `bs_goods` */

/*Table structure for table `bs_goods_detail` */

DROP TABLE IF EXISTS `bs_goods_detail`;

CREATE TABLE `bs_goods_detail` (
  `id` int(11) NOT NULL COMMENT '主键id',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品id',
  `goods_content` text COMMENT '商品详情信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bs_goods_detail` */

/*Table structure for table `bs_sku` */

DROP TABLE IF EXISTS `bs_sku`;

CREATE TABLE `bs_sku` (
  `id` int(11) unsigned NOT NULL COMMENT '主键id',
  `sku_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'sku名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `bs_sku` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
