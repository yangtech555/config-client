package com.yhbtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanghongbo on 2018/4/7.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${yang.hello}")
    private String yanghello;

    @RequestMapping(value = "yh",method = RequestMethod.GET)
    public String hello(){
        return  yanghello;
    }
}
