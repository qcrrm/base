package com.qcrrm.base.result;

import java.io.Serializable;

/**
 * 统一返回值
 *
 * @param <T>
 * @author qcrrm
 */
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = 202111022300L;
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultBean() {
    }

    public ResultBean(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultBean successOrFail(boolean success) {
        if (success) {
           return success("");
        }
        return fail();
    }

    public static ResultBean success() {
        return success("");
    }

    public static <T> ResultBean<T> success(T data) {
        return withCode(ResultCode.SUCCESS, data);
    }

    public static <T> ResultBean<T> fail() {
        return withCode(ResultCode.FAIL);
    }

    public static ResultBean withCode(ResultCode resultCode) {
        return withCode(resultCode, "");
    }

    public static <T> ResultBean<T> withCode(ResultCode resultCode, T data) {
        return new ResultBean(resultCode.getCode(), resultCode.getMsg(), data);
    }

}
