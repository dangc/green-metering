package com.nuri.green.metering.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LPMeteringEventLogRdo {

    private Integer meterId;
    private String meterSerial;
    private String eventDt;
    private String eventCd;
    private String eventNm;
    private String eventMsg;
    private String locationId;
    private String locationNm;
    private String aptNo;
    private String aptNm;
    private Integer deviceId;
    private String deviceSerial;
    private String regDt;
    private String updateDt;
}
