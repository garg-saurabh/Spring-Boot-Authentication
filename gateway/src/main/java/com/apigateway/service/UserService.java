package com.apigateway.service;

import com.apigateway.model.LoginUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {

    User save(LoginUser user);
    UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException;
}
