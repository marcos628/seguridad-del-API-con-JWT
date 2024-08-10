package com.example.myproject.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService{


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aquí se debería cargar el usuario desde una base de datos o un repositorio
        // Ejemplo estático:
        return new org.springframework.security.core.userdetails.User(username, "password", new ArrayList<>());
    }

    public void authenticate(String username, String password) throws Exception {
        // Aquí puedes añadir lógica para autenticar el usuario (verificar en base de datos)
        if (!"password".equals(password)) {
            throw new Exception("Invalid credentials");
        }
    }


}
