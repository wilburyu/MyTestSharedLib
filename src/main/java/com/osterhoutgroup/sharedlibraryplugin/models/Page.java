package com.osterhoutgroup.sharedlibraryplugin.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page<T> {

    @JsonProperty("total_number_of_items")
    private int totalNumberOfItems;

    @JsonProperty("page_size")
    private int pageSize;

    @JsonProperty("current_page")
    private int currentPage;

    @JsonProperty("current_page_items")
    private List<T> currentPageItems;

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getCurrentPageItems() {
        return currentPageItems;
    }

    public void setCurrentPageItems(List<T> currentPageItems) {
        this.currentPageItems = currentPageItems;
    }
}
