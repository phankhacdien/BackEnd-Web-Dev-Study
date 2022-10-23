package com.example.security_viblo_nguyenhoangnam.Services;

import com.example.security_viblo_nguyenhoangnam.Entities.CustomizedUserDetails;
import com.example.security_viblo_nguyenhoangnam.Entities.User;
import com.example.security_viblo_nguyenhoangnam.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("Cannot Found user named: " + userName);
        }
        return new CustomizedUserDetails(user);
    }
}
