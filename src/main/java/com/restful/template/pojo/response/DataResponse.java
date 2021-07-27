package com.restful.template.pojo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("响应数据")
public class DataResponse<T> implements Serializable {

    private static final long serialVersionUID = -3103375427318475059L;

    /**
     * 返回数据
     */
    private T data;

    public DataResponse() {
    }

    public DataResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public DataResponse setData(T data) {
        this.data = data;
        return this;
    }
}
