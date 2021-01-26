package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPChannel;
import com.nuri.green.metering.entity.LPMeteringChannelRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpMeteringChannelJpo")
public class LPMeteringChannelJpo extends CommonObj {

    private Integer meterId;
    private String meterType;
    private String meterTypeNm;
    private String channel;
    private String channelNm;
    private Integer channelIdx;
    private Integer useYn;

    private String regionId;

    public LPMeteringChannelJpo(LPChannel lpChannel) {
        if(lpChannel != null) {
            BeanUtils.copyProperties(lpChannel, this);
        }
    }

    public LPMeteringChannelRdo toDomain(){
        LPMeteringChannelRdo lpMeteringChannelRdo = new LPMeteringChannelRdo();
        BeanUtils.copyProperties(this, lpMeteringChannelRdo);
        return lpMeteringChannelRdo;
    }
}
