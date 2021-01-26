package com.nuri.green.metering.spec;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterAptService {
    List<LPMeteringByMeterRdo> getLPMeteringByApt(LPMeteringApt lpMeteringApt);
    List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringApt lpMeteringApt);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringApt lpMeteringApt);
    List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringApt lpMeteringApt);
}
