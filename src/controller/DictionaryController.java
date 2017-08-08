package controller;

import entity.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.i.DictionaryService;

import java.util.List;

/**
 * Created by luozhong on 2017/8/6.
 */
@Controller
public class DictionaryController {
    @Autowired
    @Qualifier("dictionaryService")
    private DictionaryService dictionaryService;

    @RequestMapping(value="/list")
    @ResponseBody
    public List<Dictionary> list(){
        List<Dictionary> dictionaryList=dictionaryService.showDictionary();
        return dictionaryList;
    }
    @RequestMapping(value="/add")
    @ResponseBody
    public String add(@RequestParam String dic_name, @RequestParam String dic_type){
        Dictionary dictionary=new Dictionary(dic_name,dic_type);
        dictionaryService.addDictionary(dictionary);
        return "success";
    }
    @RequestMapping(value="/delete")
    @ResponseBody
    public String delete(@RequestParam Integer id){
        dictionaryService.deleteDictionary(id);
        return "success";
    }
    @RequestMapping(value="/update")
    @ResponseBody
    public String update(@RequestParam Integer id,@RequestParam String dic_name,@RequestParam String dic_type){
        Dictionary dictionary=new Dictionary(id,dic_name,dic_type);
        dictionaryService.updateDictionary(dictionary);
        return "success";
    }
    @RequestMapping(value="selectById")
    @ResponseBody
    public Dictionary selectById(@RequestParam Integer id){
        Dictionary dictionary=dictionaryService.selectDictionaryById(id);
        return dictionary;
    }
}
