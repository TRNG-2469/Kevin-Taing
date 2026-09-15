package week8.day2.spapigw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGateWayController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Gateway!";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Hello " + name + " from gateway!";
    }
}
