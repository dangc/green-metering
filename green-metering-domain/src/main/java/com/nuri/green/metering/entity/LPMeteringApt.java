package com.nuri.green.metering.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value = "LPMeteringApt", description = "단지별 전력사용량 (LP) 모델")
public class LPMeteringApt {

    private String regionId;
    private String aptNo;
    private Integer meterId;
    private Integer measurementPointId;
    private String channel;
    private String eventCd;
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

    public LPMeteringApt(String regionId, String aptNo, Integer meterId, Integer measurementPointId, String channel, String eventCd, String startDate, String endDate, Integer offset, Integer limit, Integer page, String orderby) {
        this.regionId = regionId;
        this.aptNo = aptNo;
        this.meterId = meterId;
        this.measurementPointId = measurementPointId;
        this.channel = channel;
        this.eventCd = eventCd;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offset = offset;
        this.limit = limit;
        this.page = page;
        this.orderby = orderby;
    }

    @Override
    public String toString() {
        return "LPMeteringApt{" +
                "regionId='" + regionId + '\'' +
                ", aptNo='" + aptNo + '\'' +
                ", meterId=" + meterId +
                ", measurementPointId=" + measurementPointId +
                ", channel='" + channel + '\'' +
                ", eventCd='" + eventCd + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", orderby='" + orderby + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
