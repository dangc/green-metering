package com.nuri.green.metering.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value = "LPMeteringAptBilling", description = "단지별 검침데이터 (정기검침/월별최대수요) 모델")
public class LPMeteringAptBilling {

    private String regionId;
    private String aptNo;
    private Integer meterId;
    private Integer measurementPointId;
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
        return "LPMeteringAptByChannel{" +
                "regionId='" + regionId + '\'' +
                ", aptNo='" + aptNo + '\'' +
                ", meterId=" + meterId +
                ", measurementPointId=" + measurementPointId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", orderby='" + orderby + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
