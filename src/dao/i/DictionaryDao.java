package dao.i;

import entity.Dictionary;

import java.util.List;

/**
 * Created by luozhong on 2017/8/6.
 */
public interface DictionaryDao {
    int saveDictionary(Dictionary dictionary);
    int deleteDictionaryById(Integer id);
    List<Dictionary> listDictionary();
    void updateDictionary(Dictionary dictionary);
}
