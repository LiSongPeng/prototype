package com.prototype.entity;

/**
 * Created by WFY on 2017/9/7.
 * 该类用于前台一次向后抬数据库传送多条记录（一条记录对应一个systemSetting对象）
 */
public class SystemSettings {
    private SystemSetting systemSetting;

    public SystemSettings(SystemSetting systemSetting) {
        this.systemSetting = systemSetting;
    }

    public SystemSettings() {

    }

    public SystemSetting getSystemSetting() {
        return systemSetting;
    }

    public void setSystemSetting(SystemSetting systemSetting) {
        this.systemSetting = systemSetting;
    }
}
