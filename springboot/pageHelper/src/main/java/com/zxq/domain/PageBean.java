package com.zxq.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象
 * 当前页
 * 当前页多少条记录
 * 总页数
 * 总共多少条记录
 * 当前页的数据
 */
@Component
public class PageBean<T> {

    private int totalCount;//总共多少条记录
    private int totolPage;//总页数
    private int currentCount;//每页显示多少条数据
    private int currentPage;//当前是第几页
    private List<T> userList = new ArrayList<T>();//当前页的数据

    public int getTotolPage() {
        return totolPage;
    }

    public void setTotolPage(int totolPage) {
        this.totolPage = totolPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public List<T> getUserList() {
        return userList;
    }

    public void setUserList(List<T> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", totolPage=" + totolPage +
                ", currentPage=" + currentPage +
                ", currentCount=" + currentCount +
                ", userList=" + userList +
                '}';
    }
}
