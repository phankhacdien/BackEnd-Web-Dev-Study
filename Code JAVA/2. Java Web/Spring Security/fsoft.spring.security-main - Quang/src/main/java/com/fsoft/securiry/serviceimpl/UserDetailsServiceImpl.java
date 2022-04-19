package com.fsoft.securiry.serviceimpl;

import com.fsoft.securiry.entity.AppUser;
import com.fsoft.securiry.entity.UserDetailsImpl;
import com.fsoft.securiry.repository.iAppUserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private iAppUserRepository appUserRepository;

    public UserDetailsServiceImpl(iAppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //get user with the given user's name from DB
        AppUser appUser = appUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        //convert role's name type string into granted authority
        Set<GrantedAuthority> authorities = appUser.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toSet());
        //return an implementation of interface UserDetails
        return new UserDetailsImpl(appUser.getUsername(), appUser.getPassword(), authorities);
    }
}
