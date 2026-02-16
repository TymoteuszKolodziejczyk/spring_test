package org.example.spring_test.first;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/postem")
    public String postem(@RequestParam String login, @RequestParam String pass) {
        return String.format("<h1>Login %s %s</h1>", login, pass);
    }

    @PostMapping("/postem2")
    public String postem2(@RequestBody MyBody body) {
        System.out.println(body.getLogin() + " " + body.getPass());
        return String.format("<h1>Login %s %s</h1>", body.getLogin(), body.getPass());
    }
}
