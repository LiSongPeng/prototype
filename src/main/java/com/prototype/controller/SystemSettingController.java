package com.prototype.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prototype.entity.Person;
import com.prototype.entity.SystemSetting;
import com.prototype.service.SystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

/**
 * Created by luozhong on 2017/8/8.
 */
@Controller
@SessionAttributes("Person")
public class SystemSettingController {
    @Autowired
    private SystemSettingService systemSettingService;
    public static List<SystemSetting> listOld;

    /*后台获取前端页面的数据*/
    @ResponseBody
    @RequestMapping(value = "systemSettingPOST", method = RequestMethod.POST)
    public String updateSystemSetting(@RequestParam("json") String json,
                                   @ModelAttribute("Person")Person person) {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type=mapper.getTypeFactory().constructCollectionType(ArrayList.class,SystemSetting.class);
        List<SystemSetting> listNew=null;
        try {
             listNew=mapper.readValue(json,type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (listNew == null || listNew.size() == 0) {
            System.out.println("获取前端值为空！");
        } else {
            Date date = new Date();
            for (SystemSetting systemSetting : listNew) {
                if(!listOld.get(systemSetting.getId()-1).getSysValue().equals(listNew.get(systemSetting.getId()-1).getSysValue())||
                        !listOld.get(systemSetting.getId()-1).getStatus().equals(listNew.get(systemSetting.getId()-1).getStatus()))
                {
                    systemSetting.setModifyTime(date);
                    systemSetting.setModifyPersonId(person.getId());
                    System.out.println(listOld.get(systemSetting.getId()-1).getSysValue());
                    System.out.println(listOld.get(systemSetting.getId()-1).getStatus());
                    System.out.println("===================");
                    System.out.println(listNew.get(systemSetting.getId()-1).getSysValue());
                    System.out.println(listNew.get(systemSetting.getId()-1).getStatus());

                    systemSettingService.updateSet(systemSetting);
                }

            }
        }

        return "systemSetting";
    }

    /*前端页面获取后台数据*/
    @ResponseBody
    @RequestMapping(value = "systemSettingGET", method = RequestMethod.POST)
    public List<SystemSetting> getSystemSetting(@ModelAttribute("Person")Person person) {

          listOld = systemSettingService.selectAll();
        return listOld;
    }


}
