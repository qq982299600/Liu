package com.common.em;

public enum ResultCode {

    //操作完成
    OK(0,"ok"),

    //基础错误
    ERROR(1,"error"),

    ;


    private ResultCode(Integer code, String message) {

        this.code = code;

        this.message = message;

    }

    private int code;

    private String message;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
