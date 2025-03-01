package com.yh.anychat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yh.anychat.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add Some Methods for Future Use

    Optional<User> findByUsername(String username);
}
