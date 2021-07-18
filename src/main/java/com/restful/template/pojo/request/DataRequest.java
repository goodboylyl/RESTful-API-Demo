package com.restful.template.pojo.request;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api("请求数据")
public class DataRequest {

    @ApiModelProperty("请求值1")
    private String value1;

    @ApiModelProperty("请求值2")
    private String value2;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

}
