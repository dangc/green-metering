package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPMetering;
import com.nuri.green.metering.entity.LPMeteringByChannelRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpMeteringByChannelJpo")
public class LPMeteringByChannelJpo extends CommonObj {

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

    private String regionId;
    private String eventCd;
    private String startDate;
    private String endDate;

    private String orderby; // 정렬
    private Integer offset; // offset
    private Integer limit; // limit

    public LPMeteringByChannelJpo(LPMetering lpMetering) {
        if(lpMetering != null) {
            BeanUtils.copyProperties(lpMetering, this);
        }

        // page
        if(lpMetering.getOffset() != null && lpMetering.getLimit() != null) {
            setPage(lpMetering.getOffset(), lpMetering.getLimit());
        }

        // order
        if(lpMetering.getOrderby() != null) {
            setOrder(lpMetering.getOrderby());
        }
    }

    public LPMeteringByChannelRdo toDomain(){
        LPMeteringByChannelRdo lpMeteringByChannelRdo = new LPMeteringByChannelRdo();
        BeanUtils.copyProperties(this, lpMeteringByChannelRdo);
        return lpMeteringByChannelRdo;
    }
}
