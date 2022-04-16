package com.sherlock.spring_security.Service;

import com.sherlock.spring_security.DTO.MyUserDetails;
import com.sherlock.spring_security.Entity.User;
import com.sherlock.spring_security.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public MyUserDetailsService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).orElseThrow(
                () -> new UsernameNotFoundException("Not found: " + username)
        );
        return new MyUserDetails(user);
    }

    public ResponseEntity<User> registerNewUser(User user) throws Exception {
        User oldUser = userRepository.findByUserName(user.getUserName()).orElse(null);
        if (oldUser != null) {
            throw new Exception("This user name is already taken by another user");
        }else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.saveAndFlush(user);
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }
    }
}
