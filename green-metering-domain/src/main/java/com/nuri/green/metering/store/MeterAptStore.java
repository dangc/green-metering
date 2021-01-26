package com.nuri.green.metering.store;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterAptStore {
    List<LPMeteringByMeterRdo> getLPMeteringByApt(LPMeteringApt lpMeteringApt);
    List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringApt lpMeteringApt);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringApt lpMeteringApt);
    List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringApt lpMeteringApt);
}