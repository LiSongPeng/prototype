package com.prototype.entity;

public class PageUtil {
    private int limit = 8;//每页限制数,默认为10
    private int offset = 1;//当前页偏移,默认为1
    private String order;//排序
    private String ordername;//排序列名称
    private String search;//搜索内容
    //这里是模糊查询,所以需要对search字段改造下
    public void setSearch(String search) {
        this.search = "%"+search+"%";
    }

    public String getSearch() {
        return search;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }
}

