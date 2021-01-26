package com.nuri.green.metering.spec;


import com.nuri.green.metering.entity.*;

import java.util.List;

public interface MeterAptService {
    List<LPMeteringByMeterRdo> getLPMeteringByApt(LPMeteringApt lpMeteringApt);
    List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringAptBilling lpMeteringAptBilling);
    List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringAptBilling lpMeteringAptBilling);
    List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringAptEvent lpMeteringAptEvent);
}
