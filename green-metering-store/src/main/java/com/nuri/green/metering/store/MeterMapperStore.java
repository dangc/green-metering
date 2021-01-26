package com.nuri.green.metering.store;

import com.nuri.green.metering.entity.*;
import com.nuri.green.metering.store.jpo.*;
import com.nuri.green.metering.store.mapper.MeterMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MeterMapperStore implements MeterStore {

    private final MeterMapper meterEventMapper;

    public MeterMapperStore(MeterMapper meterEventMapper) {
        this.meterEventMapper = meterEventMapper;
    }

    @Override
    public List<LPMeteringByMeterRdo> getLPMeteringByMeter(LPMetering lpMetering) {
        List<LPMeteringByMeterJpo> lpMeteringByMeterJpos = meterEventMapper.getLPMeteringByMeter(new LPMeteringByMeterJpo(lpMetering));
        return lpMeteringByMeterJpos.stream().map(LPMeteringByMeterJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMetering lpMetering) {
        List<LPMeteringByChannelJpo> lpMeteringByChannelJpos = meterEventMapper.getLPMeteringByChannel(new LPMeteringByChannelJpo(lpMetering));
        return lpMeteringByChannelJpos.stream().map(LPMeteringByChannelJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringBillingRdo> getLPMeteringBilling(LPMetering lpMetering) {
        List<LPMeteringBillingJpo> lpMeteringBillingJpos = meterEventMapper.getLPMeteringBilling(new LPMeteringBillingJpo(lpMetering));
        return lpMeteringBillingJpos.stream().map(LPMeteringBillingJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMetering lpMetering) {
        List<LPMeteringMonthlyDemandJpo> lpMeteringMonthlyDemandJpos = meterEventMapper.getLPMeteringMonthlyDemand(new LPMeteringMonthlyDemandJpo(lpMetering));
        return lpMeteringMonthlyDemandJpos.stream().map(LPMeteringMonthlyDemandJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMetering lpMetering) {
        List<LPMeteringEventLogJpo> lpMeteringEventLogJpos = meterEventMapper.getLPMeteringEventLog(new LPMeteringEventLogJpo(lpMetering));
        return lpMeteringEventLogJpos.stream().map(LPMeteringEventLogJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel) {
        List<LPMeteringChannelJpo> lpMeteringChannelJpos = meterEventMapper.getLPMeteringChannel(new LPMeteringChannelJpo(lpChannel));
        return lpMeteringChannelJpos.stream().map(LPMeteringChannelJpo::toDomain).collect(Collectors.toList());
    }
}
