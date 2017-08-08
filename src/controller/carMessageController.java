package controller;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.i.carMessageDao;
import entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

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
    @RequestMapping("/queryCarMessage.do")
    @ResponseBody
    public String helloWorld(Model model) throws  IOException {
        System.out.println("hello!!");
        model.addAttribute("message", "Hello World!");

        carMessage cm = carmessageDao.queryCarMessage(1);

        model.addAttribute("cm", cm);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(cm);

        System.out.println("车辆基本信息："+json);
        return "index";
    }


    //事故记录表控制方法

    @RequestMapping("/queryAccident.do")

    public String queryAccident(Model model) throws  IOException {
        System.out.println("hello!!");
        model.addAttribute("message", "Hello World!");

        accidentRecord ar = carmessageDao.queryAccident(1);

        model.addAttribute("ar", ar);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ar);

        System.out.println("事故记录："+json);
        return "forward:/index.jsp";



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

    //车型记录表控制方法

    @RequestMapping("/queryCarType.do")
    @ResponseBody
    public ModelAndView queryCarType() throws  IOException {
        System.out.println("hello!!");

        ModelAndView mv=new ModelAndView();
        mv.setView(new MappingJackson2JsonView());
        PageHelper.startPage(1,5);
        carType ct = carmessageDao.queryCarType(1);
        List<carType> list =carmessageDao.queryAll();

        PageInfo<carType> p=new PageInfo<carType>(list);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ct);

        //mv.addObject("vehicleModel",list);



        mv.addObject("carType", list);
        mv.addObject("page", p);
        mv.setViewName("vehicleModel");


        System.out.println(p);
        System.out.println(ct);
        System.out.println(list);
        System.out.println("车型记录："+json);



        return mv;



    }

    //保养记录表控制方法

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
