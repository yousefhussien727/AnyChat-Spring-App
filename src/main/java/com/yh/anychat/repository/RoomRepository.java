package com.yh.anychat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yh.anychat.model.ChatRoom;

@Repository
public interface RoomRepository extends JpaRepository<ChatRoom, Long> {
    // Add Some Methods for Future Use

    Optional<ChatRoom> findByName(String name);
}
