package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPMeteringApt;
import com.nuri.green.metering.entity.LPMeteringEventLogRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpMeteringAptEventLogJpo")
public class LPMeteringAptEventLogJpo extends CommonObj {

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

    private String regionId;
    private String channel;
    private String startDate;
    private String endDate;

    private String orderby; // 정렬
    private Integer offset; // offset
    private Integer limit; // limit

    public LPMeteringAptEventLogJpo(LPMeteringApt lpMeteringApt) {
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

    public LPMeteringEventLogRdo toDomain(){
        LPMeteringEventLogRdo lpMeteringEventLogRdo = new LPMeteringEventLogRdo();
        BeanUtils.copyProperties(this, lpMeteringEventLogRdo);
        return lpMeteringEventLogRdo;
    }
}
