package com.fsoft.securiry.repository;

import com.fsoft.securiry.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iAppUserRepository extends JpaRepository<AppUser, Long> {
    //create this method in order to use in loadUserByUsername() to get appUser with given userName from DB
    Optional<AppUser> findByUsername(String username);

    //check if the user's name has already been taken
    Boolean existsByUsername(String username);
}
