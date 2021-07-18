package com.restful.template.control;

import com.restful.template.pojo.request.DataRequest;
import com.restful.template.pojo.response.DataResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("RESTful API")
@RestController
public class DemoCtrl extends BaseCtrl{

    @ApiOperation("查询数据，需保证幂等")
    @GetMapping("/data/v1")
    public DataResponse getData(){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @ApiOperation("更新或请求数据")
    @PostMapping("/data/v1")
    public DataResponse data(@RequestHeader(name = "key") String v){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @ApiOperation("添加数据，需保证幂等")
    @PutMapping("/data/v1")
    public DataResponse addData(DataRequest dataRequest){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @PatchMapping("/data/v1")
    public DataResponse updateData(DataRequest dataRequest){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @ApiOperation("删除数据，需保证幂等")
    @DeleteMapping("/data/v1")
    public DataResponse delData(DataRequest dataRequest){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

}
