package controller;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.i.carMessageDao;
import entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller

public class carMessageController {
    private carMessageDao carmessageDao;

    //车辆信息表控制方法

    @Resource(name="carMessageDao")
    public void setCarmessageDao(carMessageDao carmessageDao) {
        this.carmessageDao = carmessageDao;
    }

    /**
     * 车辆信息表控制方法
     * 1、按照车牌号码检索汽车
     * 2、
     * 3、
     */

    //1、按照车牌号码检索汽车
    @RequestMapping("/queryCarMessage.do")
    @ResponseBody
    public PageBean queryCarMessage(@RequestParam("searchKey") String searchKey,@RequestParam("pageNumber") int pageNumber) throws  IOException {
        PageBean aa=new PageBean();
        PageHelper.startPage(pageNumber,5);
        List<carMessage> list =carmessageDao.queryCarMessage(searchKey);
        PageInfo<carMessage> p=new PageInfo<carMessage>(list);
        aa.setTotalPages(p.getPages());
        aa.setPageSize(p.getPageSize());
        aa.setCurrentPage(p.getPageNum());
        aa.setContent(list);
        return aa;
    }


    //事故记录表控制方法
    //按照事故内容关键词进行检索
    @RequestMapping("/queryAccident.do")
    @ResponseBody
    public PageBean queryAccident(@RequestParam("searchKey")String searchKey,@RequestParam("pageNumber")int pageNumber) throws  IOException {
        System.out.println("hello!!");

        PageBean<accidentRecord> aa=new PageBean<accidentRecord>() ;
        PageHelper.startPage(pageNumber,5);
        List<accidentRecord> list =carmessageDao.queryAllByText(searchKey);
        PageInfo<accidentRecord> p=new PageInfo(list);
        aa.setTotalPages(p.getPages());
        aa.setPageSize(p.getPageSize());
        aa.setCurrentPage(p.getPageNum());
        aa.setContent(list);

        return aa;



    }

    //年审记录表控制方法

    @RequestMapping("/queryAnnual.do")
    @ResponseBody
    public String queryAnnual(Model model) throws  IOException {
        System.out.println("hello!!");
        model.addAttribute("message", "Hello World!");

        annualRecord arr = carmessageDao.queryAnnual(1);

        model.addAttribute("arr", arr);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(arr);

        System.out.println("年审记录："+json);
        return "index";



    }

//保险记录表控制方法

    @RequestMapping("/queryInsurance.do")
    @ResponseBody
    public String queryInsurance(Model model) throws  IOException {
        System.out.println("hello!!");
        model.addAttribute("message", "Hello World!");

        insuranceRecords ir = carmessageDao.queryInsurance(1);

        model.addAttribute("arr", ir);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ir);

        System.out.println("保险记录："+json);
        return "index";



    }


    /**
     * 车型记录表控制方法
     * 1、按照汽车品牌检索汽车
     * 2、添加汽车品牌信息
     * 3、删除汽车品牌信息
     */

    //按照汽车品牌检索汽车
    @RequestMapping("/queryCarType.do")
    @ResponseBody
    public PageBean queryCarType(@RequestParam("searchKey")String searchKey, @RequestParam("pageNumber") int pageNumber) throws  IOException {

        System.out.println("汽车品牌模糊检索!!");
        PageBean<carType> aa=new PageBean<carType>() ;
        PageHelper.startPage(pageNumber,5);
        List<carType> list =carmessageDao.queryAllByBrand(searchKey);
        PageInfo<carType> p=new PageInfo(list);
        aa.setTotalPages(p.getPages());
        aa.setPageSize(p.getPageSize());
        aa.setCurrentPage(p.getPageNum());
        aa.setContent(list);

        return aa;



    }
//添加汽车品牌信息
@RequestMapping("/addCarType.do")
@ResponseBody
public PageBean addCarType(@RequestParam("searchKey")String searchKey, @RequestParam("pageNumber") int pageNumber) throws  IOException {

   PageBean<carType> aa=new PageBean<carType>();



    return aa;



}



    //删除汽车品牌信息
    @RequestMapping("/deleteCarType.do")
    @ResponseBody
    public PageBean deleteCarType(@RequestParam("searchKey")String searchKey, @RequestParam("pageNumber") int pageNumber) throws  IOException {

        PageBean<carType> aa=new PageBean<carType>();



        return aa;



    }



    /**
     * 保养记录表控制方法
     * 1、按照汽车品牌检索汽车
     * 2、添加汽车品牌信息
     * 3、删除汽车品牌信息
     */




    @RequestMapping("/queryMaintenance.do")
    @ResponseBody
    public String queryMaintenance(Model model) throws  IOException {
        System.out.println("hello!!");
        model.addAttribute("message", "Hello World!");

        maintenanceRecord mr = carmessageDao.queryMaintenance(1);

        model.addAttribute("arr", mr);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(mr);

        System.out.println("保养记录："+json);
        return "index";



    }

}
