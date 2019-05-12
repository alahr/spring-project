/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-05-12 22:46:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `card` varchar(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `gender` char(1) DEFAULT NULL COMMENT '性别，1：男；2：女',
  `address` varchar(200) DEFAULT NULL COMMENT '住址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_person_card` (`card`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '1001', '孙悟空', '1999-09-09', '1', '花果山');
INSERT INTO `person` VALUES ('2', '1002', '猪八戒', '2000-01-01', '1', '高老庄');
INSERT INTO `person` VALUES ('3', '1003', '白骨精', '2002-02-02', '2', '山村');
INSERT INTO `person` VALUES ('4', '1004', '观世音', '1990-12-12', '2', '南海');
INSERT INTO `person` VALUES ('5', '1005', '如来', '1988-08-09', '1', '灵山');
INSERT INTO `person` VALUES ('6', '1006', '五天33333', '2019-05-12', '1', '敏捷333');
INSERT INTO `person` VALUES ('9', '1007', '唐僧1', '2019-05-12', '1', '陈家庄2');
