package service.impl;

import dao.i.DictionaryDao;
import entity.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.i.DictionaryService;

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
    public void deleteDictionary(Integer id) {
        dictionaryDao.deleteDictionaryById(id);
    }
    public List<Dictionary> showDictionary(){
        return dictionaryDao.listDictionary();
    }
    public void updateDictionary(Dictionary dictionary){
        dictionaryDao.updateDictionary(dictionary);
    }
    public Dictionary selectDictionaryById(Integer id) {
        return dictionaryDao.selectDictionaryById(id);
    }
}
