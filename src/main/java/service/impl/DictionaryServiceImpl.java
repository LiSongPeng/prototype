package service.impl;

import main.java.dao.i.DictionaryDao;
import main.java.entity.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.i.DictionaryService;

import java.util.Iterator;
import java.util.List;

/**
 * Created by luozhong on 2017/8/6.
 */
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
