package com.nuri.green.metering.store;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterStore {
    List<LPMeteringByMeterRdo> getLPMeteringByMeter(LPMetering lpMetering);
    List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMeteringByChannel lpMeteringByChannel);
    List<LPMeteringBillingRdo> getLPMeteringBilling(LPMeteringByChannel lpMeteringByChannel);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMeteringByChannel lpMeteringByChannel);
    List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMeteringEvent lpMeteringEvent);
    List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel);
}