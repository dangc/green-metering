package com.nuri.green.metering.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LPMeteringMonthlyDemandRdo {

    private Integer meterId;
    private String meterSerial;
    private String readDt;
    private String measurementPointId;
    private Integer captureDiv;
    private double activePwrTot;
    private double activePwrTime;
    private double activePwrCum;
    private double activePwrRate1;
    private double activePwrTimeRate1;
    private double activePwrCumRate1;
    private double activePwrRate2;
    private double activePwrTimeRate2;
    private double activePwrCumRate2;
    private double activePwrRate3;
    private double activePwrTimeRate3;
    private double activePwrCumRate3;
    private double activePwrRate4;
    private double activePwrTimeRate4;
    private double activePwrCumRate4;
    private double apparentPwrTotal;
    private double apparentPwrTime;
    private double apparentPwrCum;
    private double apparentPwrRate1;
    private double apparentPwrTimeRate1;
    private double apparentPwrCumRate1;
    private double apparentPwrRate2;
    private double apparentPwrTimeRate2;
    private double apparentPwrCumRate2;
    private double apparentPwrRate3;
    private double apparentPwrTimeRate3;
    private double apparentPwrCumRate3;
    private double apparentPwrRate4;
    private double apparentPwrTimeRate4;
    private double apparentPwrCumRate4;
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
