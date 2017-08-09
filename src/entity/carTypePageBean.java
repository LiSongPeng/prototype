package entity;

import java.util.List;

public class carTypePageBean {
    private int  totalPages;
    private int currentPage;
    private int  pageSize;
    private List<carType> models;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<carType> getModels() {
        return models;
    }

    public void setModels(List<carType> models) {
        this.models = models;
    }
}
