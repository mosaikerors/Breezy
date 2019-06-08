package com.mosaiker.consumer.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-auth")
public interface AuthService {

    @RequestMapping(value = "/token/get", method = RequestMethod.POST)
    JSONObject getToken(@RequestBody JSONObject request);

    @RequestMapping(value = "/token/verify", method = RequestMethod.POST)
    boolean verifyToken(@RequestBody JSONObject request);

}