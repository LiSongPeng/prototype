/*
Navicat MySQL Data Transfer

Source Server         : lzhong
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : prototype

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-08-21 09:38:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for application_form
-- ----------------------------
DROP TABLE IF EXISTS `application_form`;
CREATE TABLE `application_form` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company` varchar(20) NOT NULL,
  `vehicle_type` varchar(20) NOT NULL,
  `car_area` varchar(20) NOT NULL,
  `vehicle_time` date NOT NULL,
  `return_time` date NOT NULL,
  `vehicle_reason` varchar(20) NOT NULL,
  `secrecy` varchar(20) NOT NULL,
  `passenger_number` int(11) NOT NULL,
  `applicant` varchar(20) NOT NULL,
  `number` varchar(20) NOT NULL,
  `path` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of application_form
-- ----------------------------
INSERT INTO `application_form` VALUES ('1', '百度在线网络科技有限公司', '大型客车', '本市', '2017-08-16', '2017-08-30', '拉货', '保密', '11', '罗众', '15202203968', '天津-北京');

-- ----------------------------
-- Table structure for approval_form
-- ----------------------------
DROP TABLE IF EXISTS `approval_form`;
CREATE TABLE `approval_form` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `application_id` int(11) NOT NULL,
  `oppion` varchar(20) NOT NULL,
  `is_agree` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of approval_form
-- ----------------------------

-- ----------------------------
-- Table structure for dic_form
-- ----------------------------
DROP TABLE IF EXISTS `dic_form`;
CREATE TABLE `dic_form` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dic_name` varchar(18) DEFAULT NULL,
  `dic_type` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dic_form
-- ----------------------------
INSERT INTO `dic_form` VALUES ('3', '车辆类型', '城市公交车');
INSERT INTO `dic_form` VALUES ('4', '车辆类型', '中型客车');
INSERT INTO `dic_form` VALUES ('5', '车辆类型', '大型货车');
INSERT INTO `dic_form` VALUES ('6', '车辆类型', '小型汽车');
INSERT INTO `dic_form` VALUES ('7', '车辆类型', '小型启动档汽车');
INSERT INTO `dic_form` VALUES ('8', '用车理由', '拉货');
INSERT INTO `dic_form` VALUES ('9', '用车理由', '载人');
INSERT INTO `dic_form` VALUES ('10', '是否保密', '保密');
INSERT INTO `dic_form` VALUES ('11', '是否保密', '不保密');
INSERT INTO `dic_form` VALUES ('13', '车辆类型', '大型客车');
INSERT INTO `dic_form` VALUES ('14', '车辆类型', '牵引车');

-- ----------------------------
-- Table structure for dispatching_form
-- ----------------------------
DROP TABLE IF EXISTS `dispatching_form`;
CREATE TABLE `dispatching_form` (
  `id` int(11) NOT NULL,
  `car_driver` varchar(20) NOT NULL,
  `vehicle_mileage` int(20) NOT NULL,
  `fuel_outpu` int(11) NOT NULL,
  `driver` varchar(20) NOT NULL,
  `driver_phone` varchar(20) NOT NULL,
  `car_type` varchar(20) NOT NULL,
  `dispatching_type` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dispatching_form
-- ----------------------------

-- ----------------------------
-- Table structure for return_form
-- ----------------------------
DROP TABLE IF EXISTS `return_form`;
CREATE TABLE `return_form` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `return_fuel` int(11) NOT NULL,
  `return_mileage` int(11) NOT NULL,
  `test_people` varchar(20) NOT NULL,
  `is_good` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of return_form
-- ----------------------------

-- ----------------------------
-- Table structure for syssetting_form
-- ----------------------------
DROP TABLE IF EXISTS `syssetting_form`;
CREATE TABLE `syssetting_form` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `annual_examination_time` date DEFAULT NULL,
  `state1` int(11) DEFAULT NULL,
  `renewal_time` date DEFAULT NULL,
  `state2` int(11) DEFAULT NULL,
  `maintenance_mileage` int(11) DEFAULT NULL,
  `state3` int(11) DEFAULT NULL,
  `maintenance_time` date DEFAULT NULL,
  `state4` int(11) DEFAULT NULL,
  `refresh_frequency` varchar(18) DEFAULT NULL,
  `state5` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syssetting_form
-- ----------------------------
INSERT INTO `syssetting_form` VALUES ('1', '2017-08-22', '1', '2017-08-17', '0', '100', '1', '2017-08-24', '1', '10分钟', '1');
SET FOREIGN_KEY_CHECKS=1;
