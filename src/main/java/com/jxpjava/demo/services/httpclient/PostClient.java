package com.jxpjava.demo.services.httpclient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.Map;

@HttpExchange(url = "/arena")
public interface PostClient {

    @PostExchange("/register")
    public String register(@RequestBody Map<String, String> params);

}
