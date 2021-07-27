package com.restful.template.service.impl;

import com.restful.template.common.error.ErrInfo;
import com.restful.template.common.exception.BanException;
import com.restful.template.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public void test1() {
        throw new BanException(ErrInfo.FORBIDDEN);
    }
}
