package com.nuri.green.metering.page;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PagingGridResult<T> {

    private int totalCnt;
    private List<T> datas;
}
