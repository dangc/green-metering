package com.nuri.green.metering.page;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderByMap {

    private String sort;
    private String dir;

    public OrderByMap(String sort, String dir) {
        this.sort = sort;
        this.dir = dir;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
