package com.prototype.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.prototype.dao.carMessageDao;
import com.prototype.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

@Controller
public class carMessageController {
    private carMessageDao carmessageDao;
    @Resource(name="carMessageDao")
    public void setCarmessageDao(carMessageDao carmessageDao) {
        this.carmessageDao = carmessageDao;
    }
    public carMessageDao getCarmessageDao() {
        return carmessageDao;
    }

    /**
     * 车辆信息表控制方法
     * 1、按照车牌号码检索汽车
     * 2、添加一条车辆信息
     * 3、删除一条车辆信息
     * 4、修改一条车辆信息
     */

    //1、按照车牌号码检索汽车
    @RequestMapping("/queryCarMessage.do")
    @ResponseBody
    public PageBean queryCarMessage(@RequestParam("searchKey") String searchKey, @RequestParam("pageNumber") int pageNumber) throws IOException {
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


    //2、添加一条车辆信息
    @RequestMapping(value="addCarMessage.do",method = RequestMethod.POST)

    public String addCarMessage(@RequestParam("carImg") CommonsMultipartFile file,
                                HttpServletRequest request){

        MultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        MultipartHttpServletRequest multipartRequest = resolver.resolveMultipart(request);
        // 获得原始文件名
        String fileName = file.getOriginalFilename();
        System.out.println("原始文件名:" + fileName);

        // 新文件名·UUID含义是通用唯一识别码
        String newFileName = UUID.randomUUID() + fileName;
        carMessage carmessage=new carMessage();
        carmessage.setCarImg(newFileName);
        carmessage.setChassisNumber(multipartRequest.getParameter("chassisNumber"));
        carmessage.setCompanyUnits(multipartRequest.getParameter("companyUnits"));
        carmessage.setEngineNumber(multipartRequest.getParameter("engineNumber"));
        carmessage.setLicenseId(multipartRequest.getParameter("licenseId"));
        carmessage.setTerminalNumber(Integer.parseInt(multipartRequest.getParameter("TerminalNumber")));
        carmessage.setTotalKilometers(Float.parseFloat(multipartRequest.getParameter("totalKilometers")));
        carmessage.setTypeId(Integer.parseInt(multipartRequest.getParameter("typeId")));

        // 获得项目的路径
        ServletContext sc = request.getSession().getServletContext();
        // 上传位置
        String path = sc.getRealPath("/img") + "/"; // 设定文件保存的目录
        System.out.println("path="+path);

        File f = new File(path);
        if (!f.exists())
            f.mkdirs();
        if (!file.isEmpty()) {
            try {
                FileOutputStream fos = new FileOutputStream(path + newFileName);
                InputStream in = file.getInputStream();
                int b = 0;
                while ((b = in.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("上传图片到:" + path + newFileName);
        carmessageDao.addCarMessage(carmessage);

        return "forward:/index.jsp";

    }

    //3、删除一条车辆信息
    @RequestMapping("deleteCarMessage.do")
    public String deleteCarMessage(){





        return "";
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
