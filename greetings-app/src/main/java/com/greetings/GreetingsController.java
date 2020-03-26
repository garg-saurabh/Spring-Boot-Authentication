package com.greetings;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingsController {

    @GetMapping
    public String fetchGreeting() {
        return "Hello from Greetings Service.";
    }

    @PostMapping
    public String addGreeting(@RequestBody String greeting) {
        return "Greeting Saved Successfully";
    }

}
