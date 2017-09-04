-- 2017.8.31
-- 修改syssetting_form表中settingName为sysName
ALTER TABLE person CHANGE COLUMN settingName sysName VARCHAR(20);
-- 修改syssetting_form表中setKey为sysKey
ALTER TABLE person CHANGE COLUMN setKey sysKey VARCHAR(20);
-- 修改syssetting_form表中value为sysKeyValue
ALTER TABLE person CHANGE COLUMN value sysKeyValue VARCHAR(20);
--修改syssetting_form表中的modifyPerson为modifyPersonId
ALTER TABLE `syssetting_form`
CHANGE COLUMN `modifyPerson` `modifyPersonId`  varchar(20)
--修改syssetting_form表中的modifyPersonId为person表的外键
ALTER TABLE `syssetting_form` ADD FOREIGN KEY (`modifyPersonId`) REFERENCES `person` (`u_id`);