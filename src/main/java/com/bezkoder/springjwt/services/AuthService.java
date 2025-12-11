package com.bezkoder.springjwt.services;

import com.bezkoder.springjwt.payload.request.LoginRequest;
import com.bezkoder.springjwt.payload.request.SignupRequest;
import com.bezkoder.springjwt.payload.response.JwtResponse;
import com.bezkoder.springjwt.payload.response.MessageResponse;

public interface AuthService {
  JwtResponse authenticateUser(LoginRequest loginRequest);
  MessageResponse registerUser(SignupRequest signUpRequest);
}

