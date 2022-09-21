package com.fsoft.securiry.controller;

import com.fsoft.securiry.dto.Req.AppUserCreationDTO;
import com.fsoft.securiry.dto.Req.AppUserSignInDTO;
import com.fsoft.securiry.dto.Res.AppUserDTO;
import com.fsoft.securiry.exception.ServiceException;
import com.fsoft.securiry.jwt.JwtUtil;
import com.fsoft.securiry.repository.iAppUserRepository;
import com.fsoft.securiry.service.iAppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class MainController {
    private iAppUserRepository appUserRepository;
    private iAppUserService appUserService;
    private AuthenticationManager authenticationManager;
    private UserDetailsService userDetailsService;
    private JwtUtil jwtUtil;

    public MainController(iAppUserRepository appUserRepository,
                          iAppUserService appUserService,
                          AuthenticationManager authenticationManager,
                          UserDetailsService userDetailsService,
                          JwtUtil jwtUtil) {
        this.appUserRepository = appUserRepository;
        this.appUserService = appUserService;
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtil = jwtUtil;
    }

    //anyone can have access to this API to sign in
    @PostMapping("/sign-in")
    public ResponseEntity<String> authenticateUser(@RequestBody AppUserSignInDTO signInDTO) throws ServiceException {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(signInDTO.getUsername(),
                            signInDTO.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception e) {
            throw new ServiceException("Error, Incorrect username or password!");
        }
        //if the above code is successful then we return JWT token to client
        UserDetails userDetails = userDetailsService.loadUserByUsername(signInDTO.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);

        //set authentication into context, later on we do not need to get authentication from DB, saved based on session
        return new ResponseEntity<>(jwt, HttpStatus.OK);
    }

    //anyone can have access to this API to sign up membership
    @PostMapping("/sign-up")
    public ResponseEntity<String> registerUser(@RequestBody AppUserCreationDTO signUpDTO) throws ServiceException {
        if (appUserRepository.existsByUsername(signUpDTO.getUsername())) {
            throw new ServiceException("Error!");
        }
        appUserService.add(signUpDTO);
        return new ResponseEntity<>("Signed-up successful", HttpStatus.OK);
    }
}
