package com.nuri.green.metering.common;


public enum ResultCode {

    Y(1, true),
    N(0, false);

    private int code;
    private boolean value;

    ResultCode(int code, boolean value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }
    public Boolean getValue() {
        return value;
    }
}
