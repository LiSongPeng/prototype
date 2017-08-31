-- 修改person表中u_id为id
ALTER TABLE person CHANGE COLUMN u_id id VARCHAR(36);
-- 修改person表中，passWord字段名及长度
ALTER TABLE person CHANGE COLUMN passWord password VARCHAR(32) NOT NULL ;
--