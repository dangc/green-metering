package com.nuri.green.metering.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LPMeteringByMeterRdo {

    private Integer meterId;
    private String meterSerial;
    private String readDt;
    private String channel;
    private String channelNm;
    private String measurementPointId;
    private Integer captureDiv;
    private Double meterValue;
    private Double meterValueInterval;
    private String meterStatus;
    private Integer lpInterval;
    private String locationId;
    private String locationNm;
    private String aptNo;
    private String aptNm;
    private String mtime;
    private String itime;
    private Integer deviceId;
    private String deviceSerial;
    private String regDt;
    private String updateDt;
}
