package com.nuri.green.metering.response;

import com.nuri.green.metering.common.ErrorCode;
import com.nuri.green.metering.common.ResultCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMessage<T> {

    int resultCode;
    String errorCode;
    String errorMsg;
    private T payload;

    public ResponseMessage(ResultCode resultCode, T result) {

        this.resultCode = resultCode.getCode();
        this.payload = result;
        this.errorCode = null;
        this.errorMsg = null;
    }

    public ResponseMessage(ResultCode resultCode, ErrorCode errorCode, String errorMsg) {

        this.resultCode = resultCode.getCode();
        this.errorCode = errorCode.getCode();
        this.errorMsg = errorMsg;
        this.payload = null;
    }
}
