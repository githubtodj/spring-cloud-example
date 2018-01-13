package com.xt.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by june on 2018/1/11.
 */
@FeignClient(name= "spring-cloud-producer2", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);

}
