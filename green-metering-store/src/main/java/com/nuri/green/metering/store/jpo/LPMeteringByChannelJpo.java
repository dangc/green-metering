package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPMetering;
import com.nuri.green.metering.entity.LPMeteringByChannel;
import com.nuri.green.metering.entity.LPMeteringByChannelRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpMeteringByChannelJpo")
public class LPMeteringByChannelJpo extends CommonObj {

    private Integer meterId;
    private String meterSerial;
    private Integer measurementPointId;
    private String readDt;
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
    private List<LPChannelJpo> channels;

    private String orderby; // 정렬
    private Integer offset; // offset
    private Integer limit; // limit

    public LPMeteringByChannelJpo(LPMeteringByChannel lpMeteringByChannel) {
        if(lpMeteringByChannel != null) {
            BeanUtils.copyProperties(lpMeteringByChannel, this);
        }

        // page
        if(lpMeteringByChannel.getOffset() != null && lpMeteringByChannel.getLimit() != null) {
            setPage(lpMeteringByChannel.getOffset(), lpMeteringByChannel.getLimit());
        }

        // order
        if(lpMeteringByChannel.getOrderby() != null) {
            setOrder(lpMeteringByChannel.getOrderby());
        }
    }

    public LPMeteringByChannelRdo toDomain(){
        LPMeteringByChannelRdo lpMeteringByChannelRdo = new LPMeteringByChannelRdo();
        BeanUtils.copyProperties(this, lpMeteringByChannelRdo);
        return lpMeteringByChannelRdo;
    }
}
