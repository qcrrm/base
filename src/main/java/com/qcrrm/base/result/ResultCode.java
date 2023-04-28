package com.qcrrm.base.result;

/**
 * 返回值
 *
 * @author qcrrm
 */
public enum ResultCode {
    SUCCESS(0, "成功"),
    FAIL(1, "失败"),
    ERROR(500, "错误"),
    VALID_ERROR(550, "参数错误"),
    /*11001~12000用户相关*/
    USER_EXISTS(11001, "用户已存在"),
    USER_NOT_EXISTS(11002, "用户不已存在");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

