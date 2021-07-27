package com.restful.template.pojo.response;

import java.io.Serializable;

/**
 * @author liyilin
 * @date 2021/7/27 4:56 下午
 */

public class ErrorResponse<T> implements Serializable {

    /**
     * 返回信息
     */
    private String message;

    public ErrorResponse() {
    }

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
