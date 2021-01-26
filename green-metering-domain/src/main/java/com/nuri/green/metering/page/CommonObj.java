package com.nuri.green.metering.page;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CommonObj {

    private List<OrderByMap> order;
    private Pagination page;

    public void setOrder(String orders) {

        if(!"".equals(orders)) {
            order = new ArrayList<OrderByMap>();

            for(String strOrder : orders.split(",")) {
                String[]  arrSort = strOrder.split(":");
                order.add(new OrderByMap(arrSort[0], arrSort[1]));
            }
        }
    }

    public void setPage(Integer offset, Integer limit) {
        page = new Pagination(offset, limit);
    }
}
