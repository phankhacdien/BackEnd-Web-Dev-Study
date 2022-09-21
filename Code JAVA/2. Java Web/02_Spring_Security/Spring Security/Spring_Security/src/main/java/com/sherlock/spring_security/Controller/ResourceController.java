package com.sherlock.spring_security.Controller;

import com.sherlock.spring_security.Entity.User;
import com.sherlock.spring_security.Model.JwtRequest;
import com.sherlock.spring_security.Model.JwtResponse;
import com.sherlock.spring_security.Service.MyUserDetailsService;
import com.sherlock.spring_security.config.Utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {

    private final MyUserDetailsService myUserDetailsService;
    private final JwtUtils jwtUtils;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public ResourceController(MyUserDetailsService myUserDetailsService,
                              JwtUtils jwtUtils,
                              AuthenticationManager authenticationManager) {
        this.myUserDetailsService = myUserDetailsService;
        this.jwtUtils = jwtUtils;
        this.authenticationManager = authenticationManager;
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

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(), jwtRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("InValid Credentials", e);
        }

        final UserDetails userDetails = myUserDetailsService.loadUserByUsername(jwtRequest.getUserName());
        final String token = jwtUtils.generateToken(userDetails);
        return new JwtResponse(token);
    }
}
