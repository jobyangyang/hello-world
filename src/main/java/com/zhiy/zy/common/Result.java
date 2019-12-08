package com.zhiy.zy.common;

import com.zhiy.zy.common.emnu.ReturnMessage;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private String msg;
    private Integer code;
    private T data;

    private Result() {

    }

    private Result(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    private Result(ReturnMessage message, T data) {
        this.msg = message.getMsg();
        this.code = message.getCode();
        this.data = data;
    }

    private Result(String msg, Integer code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static <T> Result<T> build(String msg, Integer code, T data) {
        return new Result<>(msg, code, data);
    }

    public static <T> Result<T> error(String msg, Integer code) {
        return new Result<>(msg, code);
    }

    public static <T> Result<T> error(ReturnMessage message) {
        return new Result<>(message, null);
    }

    public static <T> Result<T> success(String msg) {
        return new Result<>(msg, 2000);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ReturnMessage.SUCCESS, data);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
