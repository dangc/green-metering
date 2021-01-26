package com.nuri.green.metering.store;

import com.nuri.green.metering.entity.*;
import com.nuri.green.metering.store.jpo.*;
import com.nuri.green.metering.store.mapper.MeterAptMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MeterAptMapperStore implements MeterAptStore {

    private final MeterAptMapper meterAptMapper;

    public MeterAptMapperStore(MeterAptMapper meterAptMapper) {
        this.meterAptMapper = meterAptMapper;
    }

    @Override
    public List<LPMeteringByMeterRdo> getLPMeteringByApt(LPMeteringApt lpMeteringApt) {
        List<LPMeteringAptByMeterJpo> lpMeteringAptByMeterJpos = meterAptMapper.getLPMeteringByApt(new LPMeteringAptByMeterJpo(lpMeteringApt));
        return lpMeteringAptByMeterJpos.stream().map(LPMeteringAptByMeterJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringBillingRdo> getLPMeteringAptBilling(LPMeteringAptBilling lpMeteringAptBilling) {
        List<LPMeteringAptBillingJpo> lpMeteringAptBillingJpos = meterAptMapper.getLPMeteringAptBilling(new LPMeteringAptBillingJpo(lpMeteringAptBilling));
        return lpMeteringAptBillingJpos.stream().map(LPMeteringAptBillingJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringMonthlyDemandRdo> getLPMeteringAptMonthlyDemand(LPMeteringAptBilling lpMeteringAptBilling) {
        List<LPMeteringAptMonthlyDemandJpo> lpMeteringAptMonthlyDemandJpos = meterAptMapper.getLPMeteringAptMonthlyDemand(new LPMeteringAptMonthlyDemandJpo(lpMeteringAptBilling));
        return lpMeteringAptMonthlyDemandJpos.stream().map(LPMeteringAptMonthlyDemandJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<LPMeteringEventLogRdo> getLPMeteringAptEventLog(LPMeteringAptEvent lpMeteringAptEvent) {
        List<LPMeteringAptEventLogJpo> lpMeteringAptEventLogJpos = meterAptMapper.getLPMeteringAptEventLog(new LPMeteringAptEventLogJpo(lpMeteringAptEvent));
        return lpMeteringAptEventLogJpos.stream().map(LPMeteringAptEventLogJpo::toDomain).collect(Collectors.toList());
    }
}
