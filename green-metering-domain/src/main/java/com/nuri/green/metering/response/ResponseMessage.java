package com.nuri.green.metering.response;

import com.nuri.green.metering.common.ErrorCode;
import com.nuri.green.metering.common.ResultCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMessage<T> {

    int resultCode;
    private T payload;

    public ResponseMessage(ResultCode resultCode, T result) {

        this.resultCode = resultCode.getCode();
        this.payload = result;
    }

    public ResponseMessage(ResultCode resultCode, ErrorCode errorCode, String errorMsg) {

        this.resultCode = resultCode.getCode();
        this.payload = null;
    }
}
