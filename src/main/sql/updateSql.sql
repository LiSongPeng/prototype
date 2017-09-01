-- 2017.8.31
-- 修改person表中u_id为id
ALTER TABLE person CHANGE COLUMN u_id id VARCHAR(36);
-- 修改person表中，passWord字段名及长度
ALTER TABLE person CHANGE COLUMN passWord password VARCHAR(32) NOT NULL ;
-- 修改role表中r_id
ALTER TABLE role CHANGE COLUMN r_id id VARCHAR(36);
-- 修改company表中c_id
ALTER TABLE company CHANGE COLUMN c_id id VARCHAR (36);
-- 修改company表中principal_id
ALTER TABLE company CHANGE COLUMN principal_id p_id VARCHAR (36);
-- 修改assets表中createPersonId
ALTER TABLE assets CHANGE COLUMN createPersonId p_id VARCHAR (36);