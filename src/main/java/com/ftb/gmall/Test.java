package com.ftb.gmall;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/hello1")
    public String test(){
        return "ftb";
    }
}
