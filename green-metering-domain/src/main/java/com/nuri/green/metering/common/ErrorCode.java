package com.nuri.green.metering.common;


public enum ErrorCode {

    E0001("E2001", "LOGIN_FAIL"),
    E0002("E0002", "ACCESS_DENIED"),
    E2001("E2001", "No Data");

    private String code;
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
