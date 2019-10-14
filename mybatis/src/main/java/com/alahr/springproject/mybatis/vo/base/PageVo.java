package com.alahr.springproject.mybatis.vo.base;

import java.io.Serializable;

public class PageVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int pageSize = 1;
    private int pageNum = 10;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
