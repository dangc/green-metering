package com.nuri.green.metering.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LPMeteringByChannelRdo {

    private Integer meterId;
    private String meterSerial;
    private String readDt;
    private String channel;
    private String channelNm;
    private String measurementPointId;
    private Integer captureDiv;
    private double meterValueCh1;
    private double meterValueIntervalCh1;
    private double meterValueCh2;
    private double meterValueIntervalCh2;
    private double meterValueCh3;
    private double meterValueIntervalCh3;
    private double meterValueCh4;
    private double meterValueIntervalCh4;
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
