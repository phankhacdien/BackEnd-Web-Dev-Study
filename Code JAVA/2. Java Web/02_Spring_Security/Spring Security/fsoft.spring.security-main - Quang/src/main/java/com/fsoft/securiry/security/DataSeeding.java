package com.fsoft.securiry.security;

import com.fsoft.securiry.entity.AppUser;
import com.fsoft.securiry.entity.Role;
import com.fsoft.securiry.repository.iAppUserRepository;
import com.fsoft.securiry.repository.iRoleRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class DataSeeding implements ApplicationListener<ContextRefreshedEvent> {
    private iAppUserRepository userRepository;
    private iRoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public DataSeeding(iAppUserRepository userRepository, iRoleRepository roleRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //Roles
        if (roleRepository.findByRoleName("ADMIN") == null) {
            roleRepository.save(new Role("ADMIN"));
        }

        if (roleRepository.findByRoleName("USER") == null) {
            roleRepository.save(new Role("USER"));
        }

        // Admin account
        //User repository return optional in method findByUsername()
        AppUser admin = userRepository.findByUsername("admin@gmail.com").orElse(null);
        if (admin == null) {
            AppUser initializedAdmin = new AppUser();
            initializedAdmin.setName("admin");
            initializedAdmin.setUsername("admin@gmail.com");
            initializedAdmin.setPassword(passwordEncoder.encode("123"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByRoleName("ADMIN"));
            roles.add(roleRepository.findByRoleName("USER"));
            initializedAdmin.setRoles(roles);
            userRepository.save(initializedAdmin);
        }

        // User account
        AppUser user = userRepository.findByUsername("user@gmail.com").orElse(null);
        if (user == null) {
            AppUser initializedUser = new AppUser();
            initializedUser.setName("user");
            initializedUser.setUsername("user@gmail.com");
            initializedUser.setPassword(passwordEncoder.encode("123"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByRoleName("USER"));
            initializedUser.setRoles(roles);
            userRepository.save(initializedUser);
        }
    }
}

