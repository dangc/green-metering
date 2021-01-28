package com.nuri.green.metering.store.jpo;

import com.nuri.green.metering.entity.LPChannel;
import com.nuri.green.metering.entity.LPMeteringChannelRdo;
import com.nuri.green.metering.page.CommonObj;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Alias("lpChannelJpo")
public class LPChannelJpo {

    private String channel;
    private String channelIdx;
    private String column1;
    private String column2;
}
