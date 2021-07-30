package com.restful.template.interceptor;

import com.restful.template.common.error.ErrInfo;
import com.restful.template.common.exception.BanException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liyilin
 * @date 2021/7/30 10:50 上午
 */
@Component
public class ServerInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //do something...
        logger.info("this is interceptor,uri : {}",request.getRequestURI());
//        if (null == request.getHeader("token"))throw new BanException(ErrInfo.FORBIDDEN);

        return true;
    }


}
