package com.restful.template.control;

import com.restful.template.pojo.request.DataRequest;
import com.restful.template.pojo.response.DataResponse;
import com.restful.template.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api("RESTful API")
@RestController
@RequestMapping("/demo")
public class DemoCtrl extends BaseCtrl{

    @Resource
    private DemoService demoService;

    @ApiOperation("查询数据，需保证幂等")
    @GetMapping("/data/v1")
    public DataResponse getData(){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @ApiOperation("查询数据，抛出权限异常")
    @GetMapping("/data/v2")
    public DataResponse getDataThrowBanError(){

        demoService.test1();
        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @ApiOperation("添加数据")
    @PostMapping("/data/v1")
    public DataResponse addData(@RequestHeader(name = "key") String v){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

    @ApiOperation("更新单条数据全部值，需传所有字段，接口保证幂等")
    @PutMapping("/data/v1")
    public DataResponse updateAllData(DataRequest dataRequest){

        DataResponse dataResponse = new DataResponse(dataRequest);

        return dataResponse;
    }

    @ApiOperation("更新单条数据部分值，只传需更新字段")
    @PatchMapping("/data/v1")
    public DataResponse updateData(DataRequest dataRequest){

        DataResponse dataResponse = new DataResponse(dataRequest);

        return dataResponse;
    }

    @ApiOperation("删除数据，需保证幂等")
    @DeleteMapping("/data/v1")
    public DataResponse delData(DataRequest dataRequest){

        DataResponse dataResponse = new DataResponse();

        return dataResponse;
    }

}
