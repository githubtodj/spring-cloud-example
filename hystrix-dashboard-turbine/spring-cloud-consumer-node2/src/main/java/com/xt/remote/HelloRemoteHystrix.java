package com.xt.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by june on 2018/1/11.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello " +name+", node2.this messge send failed ";
    }
}
