package com.hello;

import org.springframework.web.bind.annotation.*;

@RestController


public class HelloController {
    @RequestMapping("/uc1")
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }

    @RequestMapping("/uc2")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @RequestMapping("/uc3/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
