package com.nuri.green.metering.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value = "LPMetering", description = "미터별 전력사용량 (LP) 모델")
public class LPMetering {

    @ApiModelProperty(required = true, value = "region 아이디")
    private String regionId;
    @ApiModelProperty(required = true, value = "미터 아이디")
    private Integer meterId;
    private String channel;
    private String startDate;
    private String endDate;

    @ApiModelProperty(required = false, value = "정렬 ex)orderby=field1:asc,field2:desc")
    private String orderby; // 정렬
    @ApiModelProperty(required = false, value = "pagination offset 번호")
    private Integer offset; // offset
    @ApiModelProperty(required = false, value = "pagination limit 번호")
    private Integer limit; // limit
    @ApiModelProperty(required = false, value = "pagination page 번호")
    private Integer page; // page

    @Override
    public String toString() {
        return "LPMetering{" +
                "regionId='" + regionId + '\'' +
                ", meterId=" + meterId +
                ", channel='" + channel + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", orderby='" + orderby + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
