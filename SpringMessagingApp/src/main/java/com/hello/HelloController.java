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

    @PostMapping("/uc4")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}
