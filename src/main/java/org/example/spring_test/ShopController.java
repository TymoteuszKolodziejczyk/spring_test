package org.example.spring_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @GetMapping("")
    public String buy() {
        return "<h1>Bought</h1>";
    }
}
