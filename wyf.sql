-- 2017.8.31
--master_fence表修改
-- 修改master_fence表中fid改为id
ALTER TABLE master_fence CHANGE COLUMN fid id VARCHAR(36);
-- 修改master_fence表中r_longitude改为longitude
ALTER TABLE master_fence CHANGE COLUMN r_longitude longitude DOUBLE(10,6) not null;
-- 修改master_fence表中r_latitude改为latitude
ALTER TABLE master_fence CHANGE COLUMN r_latitude latitude DOUBLE(10,6) not null;

-- polygon_fence表修改
-- 修改polygon_fence表中pid改为id
ALTER TABLE polygon_fence CHANGE COLUMN pid id VARCHAR(36);
-- 修改polygon_fence表中p_longitude改为longitude
ALTER TABLE polygon_fence CHANGE COLUMN p_longitude longitude DOUBLE(10,6) not null;
-- 修改polygon_fence表中p_latitude改为latitude
ALTER TABLE polygon_fence CHANGE COLUMN p_latitude latitude DOUBLE(10,6) not null;
-- 修改polygon_fence表中f_id改为fid
ALTER TABLE polygon_fence CHANGE COLUMN f_id fid VARCHAR(36) not null;

-- alarm表修改
-- 修改alarm表中aid改为id
ALTER TABLE alarm CHANGE COLUMN aid id VARCHAR(36);
-- 修改alarm表中car_id改为carId
ALTER TABLE alarm CHANGE COLUMN car_id carId VARCHAR(36) not null;
-- 修改alarm表中fence_id改为fid
ALTER TABLE alarm CHANGE COLUMN fence_id fid VARCHAR(36) not null;

-- location表修改
-- 修改location表中lid改为id
ALTER TABLE location CHANGE COLUMN lid id VARCHAR(36);
-- 修改alarm表中car_id改为carId
ALTER TABLE location CHANGE COLUMN car_id carId VARCHAR(36) not null;

-- track表修改
-- 修改track表中lid改为id
ALTER TABLE track CHANGE COLUMN tid id VARCHAR(36);
-- 修改track表中car_id改为carId
ALTER TABLE track CHANGE COLUMN car_id carId VARCHAR(36) not null;

-- condition表修改
-- 修改condition表名为dynamic
ALTER  TABLE `condition` RENAME TO dynamic;
-- 修改dynamic表中cid改为id
ALTER TABLE dynamic CHANGE COLUMN cid id VARCHAR(36);
-- 修改dynamic表中car_id改为carId
ALTER TABLE dynamic CHANGE COLUMN car_id carId VARCHAR(36) not null;

