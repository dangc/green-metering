package com.nuri.green.metering.store;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterStore {
    List<LPMeteringByMeterRdo> getLPMeteringByMeter(LPMetering lpMetering);
    List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMetering lpMetering);
    List<LPMeteringBillingRdo> getLPMeteringBilling(LPMetering lpMetering);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMetering lpMetering);
    List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMetering lpMetering);
    List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel);
}