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
    public List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMetering lpMetering) {
        return meterStore.getLPMeteringByChannel(lpMetering);
    }

    @Override
    public List<LPMeteringBillingRdo> getLPMeteringBilling(LPMetering lpMetering) {
        return meterStore.getLPMeteringBilling(lpMetering);
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMetering lpMetering) {
        return meterStore.getLPMeteringMonthlyDemand(lpMetering);
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMetering lpMetering) {
        return meterStore.getLPMeteringEventLog(lpMetering);
    }

    @Override
    public List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel) {
        return meterStore.getLPMeteringChannel(lpChannel);
    }
}
