package com.prototype.dao;

import com.prototype.entity.Location;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/8/6.
 */
public interface LocationDao {
    Location queryById(String id);
    Location queryByCarId(String carId);
    int addLocation(@Param("location") Location location);
}
