-- 创建数据库
CREATE DATABASE prototype;

-- 使用数据库
use prototype;

-- 创建用户账户表
CREATE TABLE user(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `loginname` VARCHAR(20) NOT NULL UNIQUE COMMENT '登录账号',
    `password` VARCHAR(32) NOT NULL COMMENT '登录密码',
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='用户账户表';