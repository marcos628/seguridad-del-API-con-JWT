package com.example.myproject.controller;

import com.example.myproject.security.JwtUtil;
import com.example.myproject.models.AuthenticationRequest;
import com.example.myproject.models.AuthenticationResponse;
import com.example.myproject.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping
    public AuthenticationResponse createToken(@RequestBody AuthenticationRequest authRequest) throws Exception {
        userDetailsService.authenticate(authRequest.getUsername(), authRequest.getPassword());
        final String jwtToken = jwtUtil.generateToken(authRequest.getUsername());
        return new AuthenticationResponse(jwtToken);
    }
}