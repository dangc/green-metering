package com.nuri.green.metering.store;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterAptStore {
    List<LPMeteringByMeterRdo> getLPMeteringByApt(LPMeteringApt lpMeteringApt);
    List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringAptBilling lpMeteringAptBilling);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringAptBilling lpMeteringAptBilling);
    List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringAptEvent lpMeteringAptEvent);
}