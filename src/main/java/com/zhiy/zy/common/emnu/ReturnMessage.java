package com.zhiy.zy.common.emnu;

public enum ReturnMessage {
    SUCCESS("SUCCESS 成功！", 2000),
    ERROR("ERROR 失败！", 5000);

    private ReturnMessage() {

    }

    ReturnMessage(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    private String msg;
    private Integer code;

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
}
