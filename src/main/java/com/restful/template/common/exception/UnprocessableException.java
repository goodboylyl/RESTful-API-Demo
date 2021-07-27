package com.restful.template.common.exception;

/**
 * @author liyilin
 * @date 2021/7/27 4:54 下午
 */

public class UnprocessableException extends RuntimeException{
    private static final long serialVersionUID = -367229735495318935L;

    /**
     * 错误信息
     */
    private String msg;

    public UnprocessableException() {
    }

    public UnprocessableException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
