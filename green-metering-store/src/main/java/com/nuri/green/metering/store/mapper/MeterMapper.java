package com.nuri.green.metering.store.mapper;

import com.nuri.green.metering.store.jpo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MeterMapper {
    List<LPMeteringByMeterJpo> getLPMeteringByMeter(LPMeteringByMeterJpo lpMeteringByMeterJpo);
    List<LPMeteringByChannelJpo> getLPMeteringByChannel(LPMeteringByChannelJpo lpMeteringByChannelJpo);
    List<LPMeteringBillingJpo> getLPMeteringBilling(LPMeteringBillingJpo lpMeteringBillingJpo);
    List<LPMeteringMonthlyDemandJpo> getLPMeteringMonthlyDemand(LPMeteringMonthlyDemandJpo lpMeteringMonthlyDemandJpo);
    List<LPMeteringEventLogJpo> getLPMeteringEventLog(LPMeteringEventLogJpo lpMeteringEventLogJpo);
    List<LPMeteringChannelJpo> getLPMeteringChannel(LPMeteringChannelJpo lpMeteringChannelJpo);
    LPMeteringChannelJpo getMeterInfo(Integer meterId);
}