package com.example.security_viblo_nguyenhoangnam.Repositories;

import com.example.security_viblo_nguyenhoangnam.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
