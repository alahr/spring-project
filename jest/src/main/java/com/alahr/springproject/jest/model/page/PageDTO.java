package com.alahr.springproject.jest.model.page;

import java.io.Serializable;

public class PageDTO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private Integer currentPage = 0;

    /**
     * 分页大小
     */
    private Integer pageSize = 10;
    /**
     * 数据列表
     */
    private T data;

    private PageDTO() {
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 存值
     * @param currentPage
     * @param pageSize
     * @param data
     * @param <T>
     * @return
     */
    public static <T> PageDTO<T> of(Integer currentPage, Integer pageSize, T data) {
        PageDTO res = new PageDTO();
        res.setCurrentPage(currentPage);
        res.setPageSize(pageSize);
        res.setData(data);
        return res;
    }
}
