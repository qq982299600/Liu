package com.common;

import com.common.em.ResultCode;

/**
 * 结果集
 * @author: Redgi Liu
 * @date: 2020/7/1 17:15
 */
public class Result<T> {

    public Result(){

    }

    public Result(int code, String msg, T model){

        this.code = code;

        this.msg = msg;

        this.model = model;
    }

    private int code; //返回code

    private String msg; //返回msg

    private T model; //返回结果集

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
