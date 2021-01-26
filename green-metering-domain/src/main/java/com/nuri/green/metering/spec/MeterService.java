package com.nuri.green.metering.spec;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterService {
    List<LPMeteringByMeterRdo> getLPMeteringByMeter(LPMetering lpMetering);
    List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMetering lpMetering);
    List<LPMeteringBillingRdo> getLPMeteringBilling(LPMetering lpMetering);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMetering lpMetering);
    List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMetering lpMetering);
    List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel);
}
