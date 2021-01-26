package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPMeteringApt;
import com.nuri.green.metering.entity.LPMeteringByMeterRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpMeteringAptByMeterJpo")
public class LPMeteringAptByMeterJpo extends CommonObj {

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

    private String regionId;
    private String eventCd;
    private String startDate;
    private String endDate;

    private String orderby; // 정렬
    private Integer offset; // offset
    private Integer limit; // limit

    public LPMeteringAptByMeterJpo(LPMeteringApt lpMeteringApt) {
        if(lpMeteringApt != null) {
            BeanUtils.copyProperties(lpMeteringApt, this);
        }

        // page
        if(lpMeteringApt.getOffset() != null && lpMeteringApt.getLimit() != null) {
            setPage(lpMeteringApt.getOffset(), lpMeteringApt.getLimit());
        }

        // order
        if(lpMeteringApt.getOrderby() != null) {
            setOrder(lpMeteringApt.getOrderby());
        }
    }

    public LPMeteringByMeterRdo toDomain(){
        LPMeteringByMeterRdo lpMeteringByMeterRdo = new LPMeteringByMeterRdo();
        BeanUtils.copyProperties(this, lpMeteringByMeterRdo);
        return lpMeteringByMeterRdo;
    }
}
