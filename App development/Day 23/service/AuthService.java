package com.example.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.util.JwtUtil;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthService {
    private final UsersRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public AuthService(
      UsersRepository userRepository,
      PasswordEncoder passwordEncoder,
      AuthenticationManager authenticationManager,
      JwtUtil jwtUtil
    ) {
      this.userRepository = userRepository;
      this.passwordEncoder = passwordEncoder;
      this.authenticationManager = authenticationManager;
      this.jwtUtil = jwtUtil;
    }

    public boolean userRegistration(RegisterRequest request) {
        Users user = userRepository.findByEmail(request.getEmail()).orElse(null);
        if (user == null) {
            user = new Users();
            user.setEmail(request.getEmail());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

    public ResponseEntity<?> userAuthentication(LoginRequest request) {
        Users user = userRepository.findByEmail(request.getEmail()).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("No user found! Kindly Register or check Email");
        }

        try {
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

            String token = jwtUtil.generateToken(user);

            return ResponseEntity.ok(LoginResponse.builder()
                .token(token)
                .build());
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Wrong password! Please try again");
        }
    }
}
