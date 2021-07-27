package com.restful.template.control;

import com.restful.template.common.exception.BanException;
import com.restful.template.common.exception.NotFoundException;
import com.restful.template.common.exception.UnprocessableException;
import com.restful.template.pojo.response.DataResponse;
import com.restful.template.pojo.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BaseCtrl {
    public <T> DataResponse<T> success(T data) {
        return new DataResponse<>(data);
    }

    /** 统一异常处理 */
    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse exception(Exception e) {
        return returnError("Internal Server Error");
    }

    /** 参数错误 */
    @ResponseBody
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse ParameterException(MissingServletRequestParameterException e) {
        return returnError(e.getMessage());
    }

    /**
     * 未找到符合条件的数据
     */
    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse notFoundException(NotFoundException e) {
        return returnError(e.getMsg());
    }

    /**
     * 没有操作权限
     */
    @ResponseBody
    @ExceptionHandler(BanException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponse notAllowException(BanException e) {
        return returnError(e.getMsg());
    }

    /**
     * 内部服务调用错误
     */
    @ResponseBody
    @ExceptionHandler(UnprocessableException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErrorResponse notAllowException(UnprocessableException e) {
        return returnError(e.getMsg());
    }

    /**
     * 返回错误信息
     * @return
     */
    protected ErrorResponse returnError(String errInfo) {
        ErrorResponse response = new ErrorResponse();
        response.setMessage(errInfo);
        return response;
    }
}
