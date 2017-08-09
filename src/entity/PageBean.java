package entity;

import java.util.List;

public class PageBean<T> {
    private int  totalPages;
    private int currentPage;
    private int  pageSize;
    private List<T> models;

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

    public List<T> getModels() {
        return models;
    }

    public void setModels(List<T> models) {
        this.models = models;
    }
}
