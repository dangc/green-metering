package com.nuri.green.metering.logic;

import com.nuri.green.metering.entity.*;
import com.nuri.green.metering.spec.MeterAptService;
import com.nuri.green.metering.store.MeterAptStore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MeterAptLogic implements MeterAptService {

    private final MeterAptStore meterAptStore;

    public MeterAptLogic(MeterAptStore meterAptStore) {
        this.meterAptStore = meterAptStore;
    }


    @Override
    public List<LPMeteringByMeterRdo> getLPMeteringByApt(LPMeteringApt lpMeteringApt) {
        return meterAptStore.getLPMeteringByApt(lpMeteringApt);
    }

    @Override
    public List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringAptBilling lpMeteringAptBilling) {
        return meterAptStore.getLPMeteringAptBilling(lpMeteringAptBilling);
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringAptBilling lpMeteringAptBilling) {
        return meterAptStore.getLPMeteringAptMonthlyDemand(lpMeteringAptBilling);
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringAptEvent lpMeteringAptEvent) {
        return meterAptStore.getLPMeteringAptEventLog(lpMeteringAptEvent);
    }
}
