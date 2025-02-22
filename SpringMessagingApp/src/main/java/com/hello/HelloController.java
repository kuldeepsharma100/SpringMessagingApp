package com.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

    public class HelloController {
        @RequestMapping("/uc1")
        public String sayHello(){
            return "Hello from BridgeLabz!";
        }
}
