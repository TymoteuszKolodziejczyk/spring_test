package org.example.spring_test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/postem")
    public String postem(@RequestParam String login, @RequestParam String pass) {
        return String.format("<h1>Login %s %s</h1>", login, pass);
    }
}
