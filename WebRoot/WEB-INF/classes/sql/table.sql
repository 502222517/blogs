/*
SQLyog v10.2 
MySQL - 5.5.46 : Database - blogs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blogs` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `blogs`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `UserId` int(11) NOT NULL COMMENT '作者id',
  `Title` varchar(100) NOT NULL COMMENT '标题',
  `Content` text NOT NULL COMMENT '内容',
  `SortIndex` int(11) NOT NULL COMMENT '排序索引',
  `Status` int(10) unsigned zerofill NOT NULL COMMENT '状态，0:发布默认状态，-1:禁止显示，1.加精，2.置顶，3加精和置顶',
  `CreateTime` datetime NOT NULL COMMENT '创建时间',
  `UpdateTime` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`Id`),
  KEY `user_article` (`UserId`),
  CONSTRAINT `user_article` FOREIGN KEY (`UserId`) REFERENCES `user` (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `article` */

/*Table structure for table `banner` */

DROP TABLE IF EXISTS `banner`;

CREATE TABLE `banner` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `Title` varchar(200) DEFAULT NULL COMMENT '标题',
  `Img` varchar(200) NOT NULL COMMENT '图片',
  `Link` varchar(200) DEFAULT NULL COMMENT '链接',
  `Status` int(11) NOT NULL COMMENT '状态：0.默认，-1.下架 ，1上架',
  `SortIndex` int(10) unsigned zerofill NOT NULL COMMENT '排序索引',
  `CreateTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `banner` */

/*Table structure for table `tag` */

DROP TABLE IF EXISTS `tag`;

CREATE TABLE `tag` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `TagName` varchar(50) NOT NULL COMMENT '标签名称',
  `TagDesc` varchar(500) DEFAULT NULL COMMENT '标签描述',
  `SortIndex` int(10) unsigned zerofill DEFAULT NULL COMMENT '排序索引',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `tag` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `UserName` varchar(50) NOT NULL COMMENT '用户名',
  `Password` varchar(50) NOT NULL COMMENT '密码',
  `NickName` varchar(50) DEFAULT NULL COMMENT '昵称',
  `Sex` int(11) NOT NULL COMMENT '性别：0.未知 1.男 2.女',
  `Tel` varchar(11) DEFAULT NULL COMMENT '手机',
  `Email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `Status` int(11) NOT NULL COMMENT '状态：0.正常，-1输错密码被锁住，-2加入黑名单',
  `CreateTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`UserId`,`UserName`,`Password`,`NickName`,`Sex`,`Tel`,`Email`,`Status`,`CreateTime`) values (1,'502222517','52013145','浮游',1,'15270800382','502222517@qq.com',0,'2016-01-05 17:43:47');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
