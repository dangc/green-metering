package com.nuri.green.metering.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value = "LPMeteringAptEvent", description = "단지별 미터 이벤트 이력 모델")
public class LPMeteringAptEvent {

    private String regionId;
    private String aptNo;
    private Integer meterId;
    private Integer measurementPointId;
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

    @Override
    public String toString() {
        return "LPMeteringAptEvent{" +
                "regionId='" + regionId + '\'' +
                ", aptNo='" + aptNo + '\'' +
                ", meterId=" + meterId +
                ", measurementPointId=" + measurementPointId +
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
