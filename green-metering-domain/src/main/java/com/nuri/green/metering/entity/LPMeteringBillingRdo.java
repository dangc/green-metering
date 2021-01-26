package com.nuri.green.metering.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LPMeteringBillingRdo {

    private Integer meterId;
    private String meterSerial;
    private String readDt;
    private String measurementPointId;
    private Integer captureDiv;
    private Integer direction;
    private double activePwrTot;
    private double apprentPwrTot;
    private double leadPwrTot;
    private double laggingPwrTot;
    private double pfPwrTot;
    private double activePwrRate1;
    private double apprentPwrRate1;
    private double leadPwrRate1;
    private double laggingPwrRate1;
    private double pfPwrRate1;
    private double activePwrRate2;
    private double apprentPwrRate2;
    private double leadPwrRate2;
    private double laggingPwrRate2;
    private double pfPwrRate2;
    private double activePwrRate3;
    private double apprentPwrRate3;
    private double leadPwrRate3;
    private double laggingPwrRate3;
    private double pfPwrRate3;
    private double activePwrRate4;
    private double apprentPwrRate4;
    private double leadPwrRate4;
    private double laggingPwrRate4;
    private double pfPwrRate4;
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
