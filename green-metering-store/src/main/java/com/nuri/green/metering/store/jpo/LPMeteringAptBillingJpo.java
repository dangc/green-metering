package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPMeteringApt;
import com.nuri.green.metering.entity.LPMeteringAptBilling;
import com.nuri.green.metering.entity.LPMeteringBillingRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpMeteringAptBillingJpo")
public class LPMeteringAptBillingJpo extends CommonObj {

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

    private String regionId;
    private String channel;
    private String eventCd;
    private String startDate;
    private String endDate;

    private String orderby; // 정렬
    private Integer offset; // offset
    private Integer limit; // limit

    public LPMeteringAptBillingJpo(LPMeteringAptBilling lpMeteringAptBilling) {
        if(lpMeteringAptBilling != null) {
            BeanUtils.copyProperties(lpMeteringAptBilling, this);
        }

        // page
        if(lpMeteringAptBilling.getOffset() != null && lpMeteringAptBilling.getLimit() != null) {
            setPage(lpMeteringAptBilling.getOffset(), lpMeteringAptBilling.getLimit());
        }

        // order
        if(lpMeteringAptBilling.getOrderby() != null) {
            setOrder(lpMeteringAptBilling.getOrderby());
        }
    }

    public LPMeteringBillingRdo toDomain(){
        LPMeteringBillingRdo lpMeteringBillingRdo = new LPMeteringBillingRdo();
        BeanUtils.copyProperties(this, lpMeteringBillingRdo);
        return lpMeteringBillingRdo;
    }
}
