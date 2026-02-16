package org.example.spring_test.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}/{lastname}")
    public String hello(@PathVariable String name, @PathVariable String lastname) {
        return String.format("<h1>Hello %s %s</h1>", name, lastname);
    }
}
