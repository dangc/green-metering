package com.nuri.green.metering.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage {

    private int resultCode;
    private String errorCode;
    private String errorMsg;

    public ErrorMessage(int resultCode, String errorCode, String errorMsg) {
        super();
        this.resultCode = resultCode;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
