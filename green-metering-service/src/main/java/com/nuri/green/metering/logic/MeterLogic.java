package com.nuri.green.metering.logic;

import com.nuri.green.metering.entity.*;
import com.nuri.green.metering.spec.MeterService;
import com.nuri.green.metering.store.MeterStore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MeterLogic implements MeterService {

    private final MeterStore meterStore;

    public MeterLogic(MeterStore meterStore) {
        this.meterStore = meterStore;
    }

    @Override
    public List<LPMeteringByMeterRdo> getLPMeteringByMeter(LPMetering lpMetering) {
        return meterStore.getLPMeteringByMeter(lpMetering);
    }

    @Override
    public List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMeteringByChannel lpMeteringByChannel) {
        return meterStore.getLPMeteringByChannel(lpMeteringByChannel);
    }

    @Override
    public List<LPMeteringBillingRdo> getLPMeteringBilling(LPMeteringByChannel lpMeteringByChannel) {
        return meterStore.getLPMeteringBilling(lpMeteringByChannel);
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMeteringByChannel lpMeteringByChannel) {
        return meterStore.getLPMeteringMonthlyDemand(lpMeteringByChannel);
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMeteringEvent lpMeteringEvent) {
        return meterStore.getLPMeteringEventLog(lpMeteringEvent);
    }

    @Override
    public List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel) {
        return meterStore.getLPMeteringChannel(lpChannel);
    }
}
