package com.prototype.service.impl;

import com.prototype.dao.DictionaryDao;
import com.prototype.entity.Dictionary;
import com.prototype.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;




@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryDao dictionaryDao;
    public void addDictionary(Dictionary dictionary){
        dictionaryDao.saveDictionary(dictionary);
    }
    public void deleteDictionaryByIds(List<Integer> ids) {
        Iterator it=ids.iterator();
        while(it.hasNext()) {
            int i = (Integer) it.next();
            dictionaryDao.deleteDictionaryById(i);
        }
    }
    public List<Dictionary> selectDictionaryByName(String name){
        return (List<Dictionary>) dictionaryDao.selectDictionaryByName(name);
    }
}
