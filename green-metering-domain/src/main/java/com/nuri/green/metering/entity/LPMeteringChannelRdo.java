package com.nuri.green.metering.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LPMeteringChannelRdo {

    private String meterType;
    private String meterTypeNm;
    private String channel;
    private String channelNm;
    private Integer channelIdx;
    private Integer useYn;

}
