package service.i;

import entity.Dictionary;

import java.util.List;

/**
 * Created by luozhong on 2017/8/6.
 */
public interface DictionaryService {
    void addDictionary(Dictionary dictionary);
    void deleteDictionary(Integer id);
    List<Dictionary> showDictionary();
    void updateDictionary(Dictionary dictionary);
    Dictionary selectDictionaryById(Integer id);

}
