package com.prototype.controller;

import com.prototype.entity.SystemSetting;
import com.prototype.service.SystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luozhong on 2017/8/8.
 */
@Controller
public class SystemSettingController {
    @Autowired
    @Qualifier("systemSettingService")
    private SystemSettingService systemSettingService;

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestParam SystemSetting SystemSetting) {
        systemSettingService.updateSet(SystemSetting);
        return "success";
    }

    @RequestMapping(value = "selectById")
    @ResponseBody
    public SystemSetting selectById(Integer id) {
        SystemSetting SystemSetting = systemSettingService.selectById(id);
        return SystemSetting;
    }
}
