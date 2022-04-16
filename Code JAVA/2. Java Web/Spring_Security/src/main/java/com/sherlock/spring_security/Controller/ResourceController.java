package com.sherlock.spring_security.Controller;

import com.sherlock.spring_security.Entity.User;
import com.sherlock.spring_security.Service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {

    private final MyUserDetailsService myUserDetailsService;

    @Autowired
    public ResourceController(MyUserDetailsService myUserDetailsService) {
        this.myUserDetailsService = myUserDetailsService;
    }

    @GetMapping("/User")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("/Admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome home";
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerNewUser(@RequestBody User user) throws Exception {
        return myUserDetailsService.registerNewUser(user);
    }
}
