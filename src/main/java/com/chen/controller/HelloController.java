package com.chen.controller;


import com.chen.websocket.WebSocket;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/hello")
public class HelloController {
    //每次调用该接口，都会发送消息
    @RequestMapping("/test1")
    public String test() throws IOException {
        //调用webSocket发送消息
        WebSocket.sendInfo("nihao");
        return "test";
    }
}

