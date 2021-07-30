package com.restful.template.common.config;

import com.restful.template.interceptor.ServerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liyilin
 * @date 2021/7/30 11:07 上午
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    private ServerInterceptor serverInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(serverInterceptor)
                //不拦截swagger资源
                .excludePathPatterns("/swagger-resources/**","/swagger-ui.html","/v2/**","/webjars/**")
                ;

    }
}
