package com.example.solon.hot;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Param;

@Controller
public class DemoController {
    @Mapping("/hello")
    public String hello(@Param(defaultValue = "world") String name) {
        return String.format("Hello %s!", name);
    }
//    @Mapping("/ccc")
//    public String ccc(@Param(defaultValue = "world") String name) {
//        return String.format("ccc %s!", name);
//    }
//    @Mapping("/bbb")
//    public String bbb(@Param(defaultValue = "world") String name) {
//        return String.format("bbb %s!", name);
//    }
}
