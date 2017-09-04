package com.prototype.entity;

/**
 * Created by luozhong on 2017/8/6.
 */
public class Dictionary {

    Integer id;
    String dic_name;
    String dic_type;

    public Dictionary() {
    }

    public Dictionary(String dic_name, String dic_type) {
        this.dic_name = dic_name;
        this.dic_type = dic_type;
    }

    public Dictionary(Integer id, String dic_name, String dic_type) {
        this.id = id;
        this.dic_name = dic_name;
        this.dic_type = dic_type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDic_name() {
        return dic_name;
    }

    public void setDic_name(String dic_name) {
        this.dic_name = dic_name;
    }

    public String getDic_type() {
        return dic_type;
    }

    public void setDic_type(String dic_type) {
        this.dic_type = dic_type;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "id=" + id +
                ", dic_name='" + dic_name + '\'' +
                ", dic_type='" + dic_type + '\'' +
                '}';
    }
}
