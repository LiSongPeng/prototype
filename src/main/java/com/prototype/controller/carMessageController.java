package com.prototype.controller;

import com.prototype.entity.carMessage.maintenanceRecord;
import com.prototype.service.carMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resources;
import java.util.List;

@Controller
public class carMessageController {


    @Autowired
    private carMessageService carMessageService;

    /**
     * 车辆保养
     * 1.按照保养ID查询保养信息
     * 2.按照车牌ID查询保养信息
     * 3.查询所有保养信息
     * 4.按照保养ID删除保养信息
     * 5.添加保养信息
     **/

    //1.按照保养ID查询保养信息
    @RequestMapping("/queryMaintenanceById.form")
    @ResponseBody
    public maintenanceRecord queryMaintenanceById(@RequestParam("maintenanceId") String maintenanceId) {

        maintenanceRecord aa = carMessageService.queryMaintenanceById(maintenanceId);

        return aa;

    }
    //2.按照车牌ID查询保养信息
    @RequestMapping("/queryMaintenanceByLid.form")
    @ResponseBody
    public List<maintenanceRecord> queryMaintenanceByLid(@RequestParam("Lid") String Lid) {
        List<maintenanceRecord> aa = carMessageService.queryMaintenanceByLid(Lid);

        return aa;

    }
    //3.查询所有保养信息
    @RequestMapping("/queryMaintenance.form")
    @ResponseBody
    public List<maintenanceRecord> deleteMaintenance() {
        List<maintenanceRecord> aa = carMessageService.queryMaintenance();

        return aa;

    }
    //4.按照保养ID删除保养信息
    @RequestMapping("/deleteMaintenance.form")
    @ResponseBody
    public void deleteMaintenance(@RequestParam("maintenanceId") String maintenanceId) {
        carMessageService.deleteMaintenance(maintenanceId);

    }
    //5.添加保养信息
    @RequestMapping("/addMaintenance.form")
    @ResponseBody
    public String  addMaintenance() {
        String flag="1";
        maintenanceRecord maintenanceRecord=new maintenanceRecord();

        carMessageService.addMaintenance(maintenanceRecord);

        return flag;

    }


}