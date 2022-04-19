package com.sherlock.spring_security.Repository;

import com.sherlock.spring_security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public abstract Optional<User> findByUserName(String userName);
}
