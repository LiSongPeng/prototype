package controller;

import entity.systemSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.i.SetService;

/**
 * Created by luozhong on 2017/8/8.
 */
@Controller
public class SetController {
    @Autowired
    @Qualifier("setService")
    private SetService setService;

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestParam systemSetting systemSetting) {
        setService.updateSet(systemSetting);
        return "success";
    }

    @RequestMapping(value = "selectById")
    @ResponseBody
    public systemSetting selectById(Integer id) {
        systemSetting systemSetting = setService.selectById(id);
        return systemSetting;
    }
}
