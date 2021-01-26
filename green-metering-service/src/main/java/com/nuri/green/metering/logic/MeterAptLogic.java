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
    public List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringApt lpMeteringApt) {
        return meterAptStore.getLPMeteringAptBilling(lpMeteringApt);
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringApt lpMeteringApt) {
        return meterAptStore.getLPMeteringAptMonthlyDemand(lpMeteringApt);
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringApt lpMeteringApt) {
        return meterAptStore.getLPMeteringAptEventLog(lpMeteringApt);
    }
}
