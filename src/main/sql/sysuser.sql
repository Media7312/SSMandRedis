/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.24 : Database - tc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tc`;

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` char(32) NOT NULL DEFAULT '' COMMENT '主键',
  `organization_id` char(32) DEFAULT NULL COMMENT '组织ID',
  `register_type` varchar(10) DEFAULT NULL COMMENT '注册类型(email,mobile,account)',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `nick` varchar(100) DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `user_type` char(32) DEFAULT NULL COMMENT '用户类型',
  `sex` char(32) DEFAULT NULL COMMENT '性别',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证',
  `other_card` varchar(50) DEFAULT NULL COMMENT '其他证件',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `mobilephone` varchar(11) DEFAULT NULL COMMENT '手机',
  `phone` varchar(12) DEFAULT NULL COMMENT '座机',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ',
  `msn` varchar(20) DEFAULT NULL COMMENT 'MSN',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `website` varchar(50) DEFAULT NULL COMMENT '个人网站',
  `address` char(32) DEFAULT NULL COMMENT '住址',
  `comment` text COMMENT '个人名言',
  `pic` varchar(100) DEFAULT NULL COMMENT '个人照片',
  `head_pic` varchar(100) DEFAULT NULL COMMENT '头像',
  `last_login` datetime DEFAULT NULL COMMENT '最后登录时间',
  `login_ip` varchar(15) DEFAULT NULL COMMENT '登录ip',
  `score` bigint(20) DEFAULT NULL COMMENT '积分',
  `money` decimal(10,4) DEFAULT NULL COMMENT '余额',
  `salt` varchar(100) DEFAULT NULL COMMENT '盐',
  `role_ids` varchar(1000) DEFAULT NULL COMMENT '角色ids',
  `locked` tinyint(1) DEFAULT '0' COMMENT '锁定状态',
  `activation` tinyint(1) DEFAULT '0' COMMENT '是否激活（1、激活，0、未激活）',
  `creator_id` char(32) DEFAULT NULL COMMENT '创建人',
  `modifier_id` char(32) DEFAULT NULL COMMENT '修改人',
  `created_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_at` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_user_username` (`username`),
  KEY `idx_sys_user_organization_id` (`organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员表';

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`organization_id`,`register_type`,`username`,`password`,`nick`,`real_name`,`user_type`,`sex`,`id_card`,`other_card`,`birthday`,`mobilephone`,`phone`,`qq`,`msn`,`email`,`website`,`address`,`comment`,`pic`,`head_pic`,`last_login`,`login_ip`,`score`,`money`,`salt`,`role_ids`,`locked`,`activation`,`creator_id`,`modifier_id`,`created_at`,`modified_at`) values ('1','67199454b8e54e4dbe9b3386b46e66d0','ACCOUNT','admin','239711df204d9effc678a0c7efda5e1e','Admin','Admin','16755d99b6f148d39c489eeef231da1d','103de6d6ee4240989afb28044246fcea','','','2017-11-01','15069005640','','','',NULL,'','','','af74c52fb3a34c16b359ae2299d1f825','af74c52fb3a34c16b359ae2299d1f825','2017-07-29 12:40:57','127.0.0.1',NULL,NULL,'a4dded01c227391450cfa30cf55afea0','1,',0,1,NULL,'1',NULL,'2017-11-14 09:56:11'),('2046b445e63c4d94a8db188f057e90a8',NULL,'MOBILE','wangermazi','aefbc76c57064e5156c4e007950a18e3','王二麻子','王二麻子',NULL,'203de6d6ee4240989afb28044246fcea','','','2017-11-01','15069005645','','','',NULL,'','','','',NULL,NULL,NULL,NULL,NULL,'f23dfe352e6032af6cdc22276057ee3f','a698b2a50f714f9c82747803ffe41b5f,',NULL,NULL,NULL,'2046b445e63c4d94a8db188f057e90a8','2017-11-08 15:36:32','2017-11-13 23:30:10'),('32f27fdac5da48dea8bb9165b7399da1',NULL,'MOBILE',NULL,'96cc841cfa668654bbc16f6eab3d12b1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'15069005644',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'e96b1cfd761f3dba151747fbab478b8c','a698b2a50f714f9c82747803ffe41b5f,',1,NULL,NULL,NULL,'2017-11-08 11:15:55','2017-11-08 16:47:16'),('97de13fd62d34cd8b94e7afc232d6a3a',NULL,'MOBILE',NULL,'aa5d819d69f88de739056fea3d2d28a4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'15069005646',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'5164ceb5064607123fd7dba02278a7e6','a698b2a50f714f9c82747803ffe41b5f,',NULL,NULL,NULL,NULL,'2017-12-27 11:19:38','2017-12-27 11:28:14'),('ddf9bdba33ae47c8a931da13d1792311','c9fcc8d97b34435d928242897f7db92a',NULL,'zhangsan','9479ac19ab3f524a813db53c2a5c1e26','张三','张三','16755d99b6f148d39c489eeef231da1d','3aedb8feecf546398e3262d8ee779e05','',NULL,'2015-03-09',NULL,NULL,'','','353475081@qq.com','','11','',NULL,NULL,'2016-04-13 09:42:51','0:0:0:0:0:0:0:1',NULL,NULL,'c3067518746ddd930150e9793ae120e8','5fdf2b3c1c0c458daecee12b20e739d4,',0,1,NULL,'1','2015-03-09 23:31:32','2016-04-13 09:42:51');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
