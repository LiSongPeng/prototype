package com.prototype.controller;

import com.prototype.entity.carMessage.carType;
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
     * 车辆类型
     * 1.按照车型ID查询车型信息
     * 2.按照汽车品牌查询车型信息
     * 3.查询所有车型信息
     * 4.按照车型ID删除车型信息
     * 5.添加车型信息
     **/

    //1.按照车型ID查询车型信息
    @RequestMapping("/queryCarTypeById.form")
    @ResponseBody
    public carType queryCarTypeById(@RequestParam("typeId") String typeId) {

        carType cartype=carMessageService.queryCarTypeById(typeId);

        return cartype;
    }

    //2.按照汽车品牌查询车型信息
    @RequestMapping("/queryAllByBrand.form")
    @ResponseBody
    public List<carType> queryAllByBrand(@RequestParam("brand")String brand) {

        List<carType> aa=carMessageService.queryAllByBrand(brand);

        return aa;
    }

    //3.查询所有车型信息
    @RequestMapping("/queryCarType.form")
    @ResponseBody
    public List<carType> queryCarType() {
        List<carType> aa=carMessageService.queryCarType();
        return aa;
    }

    //4.按照车型ID删除车型信息
    @RequestMapping("/deleteCarType.form")
    @ResponseBody
    public void deleteCarType(@RequestParam("typeId") String typeId) {

        carMessageService.deleteCarType(typeId);

    }

    //5.添加车型信息
    @RequestMapping("/addCarType.form")
    @ResponseBody
    public void addCarType(carType carType) {
        carMessageService.addCarType(carType);

    }


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