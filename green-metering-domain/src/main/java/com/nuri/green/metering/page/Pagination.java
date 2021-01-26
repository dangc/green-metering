package com.nuri.green.metering.page;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pagination {

    private Integer offset;
    private Integer limit;
    private Integer page;

    public Pagination(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public Pagination(int offset, int limit, int page) {
        this.offset = offset;
        this.limit = limit;
        this.page = page;
    }
}
