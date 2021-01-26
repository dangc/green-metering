package com.nuri.green.metering.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value = "LPChannel", description = "미터타입별 LP 채널 조회 모델")
public class LPChannel {

    private String regionId;
    private String meterType;
//    private Integer meterId;

    @Override
    public String toString() {
        return "LPChannel{" +
                "regionId='" + regionId + '\'' +
                ", meterType='" + meterType + '\'' +
                '}';
    }
}
