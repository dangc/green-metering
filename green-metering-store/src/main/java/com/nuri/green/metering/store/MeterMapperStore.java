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
    public List<LPMeteringByChannelRdo> getLPMeteringByChannel(LPMeteringByChannel lpMeteringByChannel) {
        //meterType 조회
        LPMeteringChannelJpo lpMeteringChannelJpo = meterEventMapper.getMeterInfo(lpMeteringByChannel.getMeterId());
        //meterType에 해당하는 channel 조회
        List<LPChannelJpo> lpChannelJpos = meterEventMapper.getMeterChannel(lpMeteringChannelJpo.getMeterType());

        LPMeteringByChannelJpo lpMeteringByChannelJpo = new LPMeteringByChannelJpo(lpMeteringByChannel);
        lpMeteringByChannelJpo.setChannels(lpChannelJpos);
        List<LPMeteringByChannelJpo> lpMeteringByChannelJpos = meterEventMapper.getLPMeteringByChannel(lpMeteringByChannelJpo);
        return lpMeteringByChannelJpos.stream().map(LPMeteringByChannelJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringBillingRdo> getLPMeteringBilling(LPMeteringByChannel lpMeteringByChannel) {
        List<LPMeteringBillingJpo> lpMeteringBillingJpos = meterEventMapper.getLPMeteringBilling(new LPMeteringBillingJpo(lpMeteringByChannel));
        return lpMeteringBillingJpos.stream().map(LPMeteringBillingJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringMonthlyDemand(LPMeteringByChannel lpMeteringByChannel) {
        List<LPMeteringMonthlyDemandJpo> lpMeteringMonthlyDemandJpos = meterEventMapper.getLPMeteringMonthlyDemand(new LPMeteringMonthlyDemandJpo(lpMeteringByChannel));
        return lpMeteringMonthlyDemandJpos.stream().map(LPMeteringMonthlyDemandJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringEventLog(LPMeteringEvent lpMeteringEvent) {
        List<LPMeteringEventLogJpo> lpMeteringEventLogJpos = meterEventMapper.getLPMeteringEventLog(new LPMeteringEventLogJpo(lpMeteringEvent));
        return lpMeteringEventLogJpos.stream().map(LPMeteringEventLogJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringChannelRdo> getLPMeteringChannel(LPChannel lpChannel) {
        List<LPMeteringChannelJpo> lpMeteringChannelJpos = meterEventMapper.getLPMeteringChannel(new LPMeteringChannelJpo(lpChannel));
        return lpMeteringChannelJpos.stream().map(LPMeteringChannelJpo::toDomain).collect(Collectors.toList());
    }
}
