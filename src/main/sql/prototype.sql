/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : prototype

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-30 17:59:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `accidentrecord`
-- ----------------------------
DROP TABLE IF EXISTS `accidentrecord`;
CREATE TABLE `accidentrecord` (
  `accidentId` varchar(36) NOT NULL,
  `licenseId` varchar(200) DEFAULT NULL,
  `accidentTime` datetime DEFAULT NULL,
  `accidentText` varchar(200) DEFAULT NULL,
  `processingState` varchar(200) DEFAULT NULL,
  `claimStatus` varchar(200) DEFAULT NULL,
  `amount` float(12,2) DEFAULT NULL,
  PRIMARY KEY (`accidentId`),
  UNIQUE KEY `licenseId` (`licenseId`) USING BTREE,
  CONSTRAINT `accidentrecord_ibfk_1` FOREIGN KEY (`licenseId`) REFERENCES `carmessage` (`licenseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of accidentrecord
-- ----------------------------

-- ----------------------------
-- Table structure for `alarm`
-- ----------------------------
DROP TABLE IF EXISTS `alarm`;
CREATE TABLE `alarm` (
  `aid` varchar(36) NOT NULL,
  `car_id` varchar(36) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `crossTime` datetime NOT NULL,
  `returnTime` datetime NOT NULL,
  `fence_id` varchar(36) NOT NULL,
  PRIMARY KEY (`aid`),
  KEY `fence_id` (`fence_id`),
  KEY `car_id` (`car_id`),
  CONSTRAINT `alarm_ibfk_1` FOREIGN KEY (`fence_id`) REFERENCES `master_fence` (`fid`),
  CONSTRAINT `alarm_ibfk_2` FOREIGN KEY (`car_id`) REFERENCES `carmessage` (`carId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alarm
-- ----------------------------

-- ----------------------------
-- Table structure for `annualrecord`
-- ----------------------------
DROP TABLE IF EXISTS `annualrecord`;
CREATE TABLE `annualrecord` (
  `annualId` varchar(36) NOT NULL,
  `licenseId` varchar(200) DEFAULT NULL,
  `annualTime` datetime DEFAULT NULL,
  `annualText` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`annualId`),
  UNIQUE KEY `licenseId` (`licenseId`) USING BTREE,
  CONSTRAINT `annualrecord_ibfk_1` FOREIGN KEY (`licenseId`) REFERENCES `carmessage` (`licenseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of annualrecord
-- ----------------------------

-- ----------------------------
-- Table structure for `application_form`
-- ----------------------------
DROP TABLE IF EXISTS `application_form`;
CREATE TABLE `application_form` (
  `id` varchar(36) NOT NULL,
  `companyName` varchar(20) NOT NULL,
  `vehicleType` varchar(20) NOT NULL,
  `carArea` varchar(20) NOT NULL,
  `vehicleTime` datetime NOT NULL,
  `returnTime` datetime NOT NULL,
  `vehicleReason` varchar(20) NOT NULL,
  `secrecy` tinyint(1) NOT NULL,
  `passengerNumber` int(3) NOT NULL,
  `applicantId` varchar(36) NOT NULL,
  `route` varchar(20) NOT NULL,
  `oppion` varchar(255) DEFAULT NULL,
  `approver` varchar(20) NOT NULL,
  `applicantTime` datetime NOT NULL,
  `stauts` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `applicantId` (`applicantId`),
  CONSTRAINT `application_form_ibfk_1` FOREIGN KEY (`applicantId`) REFERENCES `person` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of application_form
-- ----------------------------

-- ----------------------------
-- Table structure for `assets`
-- ----------------------------
DROP TABLE IF EXISTS `assets`;
CREATE TABLE `assets` (
  `id` varchar(36) NOT NULL,
  `assetsName` varchar(20) NOT NULL,
  `url` varchar(100) NOT NULL,
  `icon` varchar(50) DEFAULT NULL,
  `type` varchar(20) NOT NULL,
  `create_time` datetime NOT NULL,
  `createPersonId` varchar(36) NOT NULL,
  `parentId` varchar(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of assets
-- ----------------------------

-- ----------------------------
-- Table structure for `carmessage`
-- ----------------------------
DROP TABLE IF EXISTS `carmessage`;
CREATE TABLE `carmessage` (
  `carId` varchar(36) NOT NULL,
  `carImg` varchar(200) DEFAULT NULL,
  `licenseId` varchar(200) DEFAULT NULL,
  `typeId` varchar(36) DEFAULT NULL,
  `engineNumber` varchar(100) DEFAULT NULL,
  `chassisNumber` varchar(200) DEFAULT NULL,
  `totalKilometers` float(12,2) DEFAULT NULL,
  `scrapVehicle` varchar(200) DEFAULT NULL,
  `vehicleStatus` varchar(200) DEFAULT NULL,
  `companyUnits` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`carId`),
  UNIQUE KEY `licenseId` (`licenseId`),
  KEY `carmessage_ibfk_1` (`companyUnits`),
  CONSTRAINT `carmessage_ibfk_1` FOREIGN KEY (`companyUnits`) REFERENCES `company` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carmessage
-- ----------------------------

-- ----------------------------
-- Table structure for `cartype`
-- ----------------------------
DROP TABLE IF EXISTS `cartype`;
CREATE TABLE `cartype` (
  `typeId` varchar(36) NOT NULL,
  `carName` varchar(200) DEFAULT NULL,
  `brand` varchar(200) DEFAULT NULL,
  `carLevel` varchar(200) DEFAULT NULL,
  `displacement` float(5,1) DEFAULT NULL,
  `productionMode` varchar(200) DEFAULT NULL,
  `power` varchar(200) DEFAULT NULL,
  `driver` varchar(200) DEFAULT NULL,
  `transmissionCase` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`typeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cartype
-- ----------------------------

-- ----------------------------
-- Table structure for `company`
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `c_id` varchar(36) NOT NULL,
  `principal_id` varchar(36) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `parentId` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for `condition`
-- ----------------------------
DROP TABLE IF EXISTS `condition`;
CREATE TABLE `condition` (
  `cid` varchar(36) NOT NULL,
  `car_id` varchar(36) NOT NULL,
  `latitude` double(10,6) NOT NULL,
  `longitude` double(10,6) NOT NULL,
  `alarm` varchar(20) DEFAULT NULL,
  `speed` float(7,2) DEFAULT NULL,
  `direction` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `car_id` (`car_id`),
  CONSTRAINT `condition_ibfk_1` FOREIGN KEY (`car_id`) REFERENCES `carmessage` (`carId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of condition
-- ----------------------------

-- ----------------------------
-- Table structure for `dic_class`
-- ----------------------------
DROP TABLE IF EXISTS `dic_class`;
CREATE TABLE `dic_class` (
  `id` varchar(36) NOT NULL,
  `name` varchar(20) NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `classify_id` varchar(36) NOT NULL,
  `deleteStatus` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `classify_id` (`classify_id`),
  CONSTRAINT `dic_class_ibfk_1` FOREIGN KEY (`classify_id`) REFERENCES `dic_form` (`classifyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dic_class
-- ----------------------------

-- ----------------------------
-- Table structure for `dic_form`
-- ----------------------------
DROP TABLE IF EXISTS `dic_form`;
CREATE TABLE `dic_form` (
  `classifyId` varchar(36) NOT NULL,
  `name` varchar(20) NOT NULL,
  `createTime` datetime NOT NULL,
  PRIMARY KEY (`classifyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dic_form
-- ----------------------------

-- ----------------------------
-- Table structure for `dispatching_form`
-- ----------------------------
DROP TABLE IF EXISTS `dispatching_form`;
CREATE TABLE `dispatching_form` (
  `id` varchar(36) NOT NULL,
  `userIdDriver` varchar(20) NOT NULL,
  `vehicleMileage` float(12,2) NOT NULL,
  `fuelOutPut` float(6,2) NOT NULL,
  `driverId` varchar(36) NOT NULL,
  `carType` varchar(20) NOT NULL,
  `dispatchingType` varchar(20) NOT NULL,
  `dispatchingTime` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `driver_id` (`driverId`),
  KEY `car_type` (`carType`),
  CONSTRAINT `dispatching_form_ibfk_1` FOREIGN KEY (`driverId`) REFERENCES `person` (`u_id`),
  CONSTRAINT `dispatching_form_ibfk_2` FOREIGN KEY (`carType`) REFERENCES `cartype` (`typeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dispatching_form
-- ----------------------------

-- ----------------------------
-- Table structure for `insurancerecords`
-- ----------------------------
DROP TABLE IF EXISTS `insurancerecords`;
CREATE TABLE `insurancerecords` (
  `insuranceId` varchar(36) NOT NULL,
  `insuranceName` varchar(200) DEFAULT NULL,
  `licenseId` varchar(200) DEFAULT NULL,
  `insuranceTime` datetime DEFAULT NULL,
  `insuranceAmount` float(12,2) DEFAULT NULL,
  `insuranceText` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`insuranceId`),
  UNIQUE KEY `licenseId` (`licenseId`) USING BTREE,
  CONSTRAINT `insurancerecords_ibfk_1` FOREIGN KEY (`licenseId`) REFERENCES `carmessage` (`licenseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insurancerecords
-- ----------------------------

-- ----------------------------
-- Table structure for `location`
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `lid` varchar(36) NOT NULL,
  `car_id` varchar(36) NOT NULL,
  `latitude` double(10,6) NOT NULL,
  `longitude` double(10,6) NOT NULL,
  `uploadTime` datetime NOT NULL,
  PRIMARY KEY (`lid`),
  KEY `car_id` (`car_id`),
  CONSTRAINT `location_ibfk_1` FOREIGN KEY (`car_id`) REFERENCES `carmessage` (`carId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of location
-- ----------------------------

-- ----------------------------
-- Table structure for `maintenancerecord`
-- ----------------------------
DROP TABLE IF EXISTS `maintenancerecord`;
CREATE TABLE `maintenancerecord` (
  `maintenanceId` varchar(36) NOT NULL,
  `licenseId` varchar(200) DEFAULT NULL,
  `maintenanceTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `maintenanceText` varchar(200) DEFAULT NULL,
  `maintenanceAmount` float(12,2) DEFAULT NULL,
  `beforeKilometers` float(12,2) DEFAULT NULL,
  PRIMARY KEY (`maintenanceId`),
  UNIQUE KEY `licenseId` (`licenseId`) USING BTREE,
  CONSTRAINT `maintenancerecord_ibfk_1` FOREIGN KEY (`licenseId`) REFERENCES `carmessage` (`licenseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of maintenancerecord
-- ----------------------------

-- ----------------------------
-- Table structure for `master_fence`
-- ----------------------------
DROP TABLE IF EXISTS `master_fence`;
CREATE TABLE `master_fence` (
  `fid` varchar(36) NOT NULL,
  `fenceName` varchar(20) NOT NULL,
  `r_longitude` double(10,6) NOT NULL,
  `r_latitude` double(10,6) NOT NULL,
  `radius` double(10,6) NOT NULL,
  `area` varchar(30) DEFAULT NULL,
  `type` int(2) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of master_fence
-- ----------------------------

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `u_id` varchar(36) NOT NULL COMMENT '用户id',
  `name` varchar(32) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `number` varchar(32) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `loginName` varchar(12) NOT NULL,
  `passWord` varchar(20) NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `loginName` (`loginName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户账户表';

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for `person_company`
-- ----------------------------
DROP TABLE IF EXISTS `person_company`;
CREATE TABLE `person_company` (
  `id` varchar(36) NOT NULL,
  `pid` varchar(36) NOT NULL,
  `cid` varchar(36) NOT NULL,
  PRIMARY KEY (`id`,`pid`,`cid`),
  KEY `pid` (`pid`),
  KEY `cid` (`cid`),
  CONSTRAINT `person_company_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `person` (`u_id`),
  CONSTRAINT `person_company_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `company` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person_company
-- ----------------------------

-- ----------------------------
-- Table structure for `person_role`
-- ----------------------------
DROP TABLE IF EXISTS `person_role`;
CREATE TABLE `person_role` (
  `id` varchar(36) NOT NULL,
  `pid` varchar(36) NOT NULL,
  `rid` varchar(36) NOT NULL,
  PRIMARY KEY (`id`,`pid`,`rid`),
  KEY `pid` (`pid`),
  KEY `rid` (`rid`),
  CONSTRAINT `person_role_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `person` (`u_id`),
  CONSTRAINT `person_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person_role
-- ----------------------------

-- ----------------------------
-- Table structure for `polygon_fence`
-- ----------------------------
DROP TABLE IF EXISTS `polygon_fence`;
CREATE TABLE `polygon_fence` (
  `pid` varchar(36) NOT NULL,
  `p_longitude` double(10,6) NOT NULL,
  `p_latitude` double(10,6) NOT NULL,
  `f_id` varchar(36) NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `f_id` (`f_id`),
  CONSTRAINT `polygon_fence_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `master_fence` (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of polygon_fence
-- ----------------------------

-- ----------------------------
-- Table structure for `return_form`
-- ----------------------------
DROP TABLE IF EXISTS `return_form`;
CREATE TABLE `return_form` (
  `id` varchar(36) NOT NULL,
  `fuelReturn` float(12,2) NOT NULL,
  `returnMileage` float(12,2) NOT NULL,
  `testPeopleName` varchar(36) NOT NULL,
  `isGood` tinyint(4) NOT NULL,
  `returnTime` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `testPeopleName` (`testPeopleName`),
  CONSTRAINT `return_form_ibfk_1` FOREIGN KEY (`testPeopleName`) REFERENCES `person` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of return_form
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `r_id` varchar(36) NOT NULL,
  `roleName` varchar(12) NOT NULL,
  `liable_id` varchar(36) NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `role_assets`
-- ----------------------------
DROP TABLE IF EXISTS `role_assets`;
CREATE TABLE `role_assets` (
  `id` varchar(36) NOT NULL,
  `rid` varchar(36) NOT NULL,
  `aid` varchar(36) NOT NULL,
  PRIMARY KEY (`id`,`rid`,`aid`),
  KEY `rid` (`rid`),
  KEY `aid` (`aid`),
  CONSTRAINT `role_assets_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `role` (`r_id`),
  CONSTRAINT `role_assets_ibfk_2` FOREIGN KEY (`aid`) REFERENCES `assets` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_assets
-- ----------------------------

-- ----------------------------
-- Table structure for `syssetting_form`
-- ----------------------------
DROP TABLE IF EXISTS `syssetting_form`;
CREATE TABLE `syssetting_form` (
  `id` varchar(36) NOT NULL,
  `settingName` varchar(20) NOT NULL,
  `setKey` varchar(20) NOT NULL,
  `value` varchar(20) NOT NULL,
  `modifyPerson` varchar(20) NOT NULL,
  `modifyTime` datetime NOT NULL,
  `status` varchar(5) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syssetting_form
-- ----------------------------

-- ----------------------------
-- Table structure for `terminal`
-- ----------------------------
DROP TABLE IF EXISTS `terminal`;
CREATE TABLE `terminal` (
  `id` varchar(36) NOT NULL,
  `terminalNo` varchar(30) NOT NULL,
  `card` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of terminal
-- ----------------------------

-- ----------------------------
-- Table structure for `track`
-- ----------------------------
DROP TABLE IF EXISTS `track`;
CREATE TABLE `track` (
  `tid` varchar(36) NOT NULL,
  `car_id` varchar(36) NOT NULL,
  `latitude` double(10,6) NOT NULL,
  `longitude` double(10,6) NOT NULL,
  `uploadTime` datetime NOT NULL,
  PRIMARY KEY (`tid`),
  KEY `car_id` (`car_id`),
  CONSTRAINT `track_ibfk_1` FOREIGN KEY (`car_id`) REFERENCES `carmessage` (`carId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of track
-- ----------------------------

-- ----------------------------
-- Table structure for `vehicle_associated`
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_associated`;
CREATE TABLE `vehicle_associated` (
  `id` varchar(36) NOT NULL,
  `applicationId` varchar(36) NOT NULL,
  `dispatchingId` varchar(36) NOT NULL,
  `returnId` varchar(36) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`,`applicationId`,`dispatchingId`,`returnId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vehicle_associated
-- ----------------------------
