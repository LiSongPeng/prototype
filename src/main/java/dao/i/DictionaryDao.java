package main.java.dao.i;

import main.java.entity.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luozhong on 2017/8/6.
 */
@Repository
public interface DictionaryDao {
    int saveDictionary(Dictionary dictionary);
    int deleteDictionaryById(int id);
    List<Dictionary> selectDictionaryByName(String name);
}
