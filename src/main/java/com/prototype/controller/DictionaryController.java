//package com.prototype.controller;
//
//import com.prototype.entity.Dictionary;
//import com.prototype.service.DictionaryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
///**
// * Created by luozhong on 2017/8/6.
// */
//@Controller
//public class DictionaryController {
//    @Autowired
//    @Qualifier("dictionaryService")
//    private DictionaryService dictionaryService;
//
//
//    @RequestMapping(value="/selectByDic_name")
//    @ResponseBody
//    public List<Dictionary> list(@RequestParam String dic_name){
//        List<Dictionary> dictionaryList=dictionaryService.selectDictionaryByName(dic_name);
//        return dictionaryList;
//    }
//    @RequestMapping(value="/add")
//    @ResponseBody
//    public String add(@RequestParam String dic_name, @RequestParam String dic_type){
//        Dictionary dictionary=new Dictionary(dic_name,dic_type);
//        dictionaryService.addDictionary(dictionary);
//        return "success";
//    }
//    @RequestMapping(value="/delete")
//    @ResponseBody
//    public String delete(@RequestParam List<Integer> ids){
//        dictionaryService.deleteDictionaryByIds(ids);
//        return "success";
//    }
//}
