package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String handle(){
        System.out.print("This is just for fun!!");
        return "for testing";
    }

}
