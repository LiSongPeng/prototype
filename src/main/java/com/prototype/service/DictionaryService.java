package com.prototype.service;


import com.prototype.entity.Dictionary;

import java.util.List;

/**
 * Created by luozhong on 2017/8/6.
 */
public interface DictionaryService {
    void addDictionary(Dictionary dictionary);
    void deleteDictionaryByIds(List<Integer> ids);
    List<Dictionary> selectDictionaryByName(String name);
}
