package com.nuri.green.metering.store.mapper;

import com.nuri.green.metering.store.jpo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MeterAptMapper {
    List<LPMeteringAptByMeterJpo> getLPMeteringByApt(LPMeteringAptByMeterJpo lpMeteringAptByMeterJpo);
    List<LPMeteringAptBillingJpo> getLPMeteringAptBilling(LPMeteringAptBillingJpo lpMeteringAptBillingJpo);
    List<LPMeteringAptMonthlyDemandJpo> getLPMeteringAptMonthlyDemand(LPMeteringAptMonthlyDemandJpo lpMeteringAptMonthlyDemandJpo);
    List<LPMeteringAptEventLogJpo> getLPMeteringAptEventLog(LPMeteringAptEventLogJpo lpMeteringAptEventLogJpo);
}