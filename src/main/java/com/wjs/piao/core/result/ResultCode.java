package com.wjs.piao.core.result;

public enum ResultCode {
    SUCCESS(200), // 成功
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    ResultCode(int code){
        this.code = code;
    }

    public int code(){return code;}
}