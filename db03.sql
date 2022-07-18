/*
 Navicat MySQL Data Transfer

 Source Server         : ivory
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : db03

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 19/07/2022 00:05:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COMMENT='部门表';

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (1, '开发部', 'db03');
INSERT INTO `dept` VALUES (2, '人事部', 'db03');
INSERT INTO `dept` VALUES (3, '财务部', 'db03');
INSERT INTO `dept` VALUES (4, '市场部', 'db03');
INSERT INTO `dept` VALUES (5, '运维部', 'db03');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
