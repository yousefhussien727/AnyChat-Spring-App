package com.yh.anychat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yh.anychat.model.ChatMessage;

@Repository
public interface ChatRepository extends JpaRepository<ChatMessage, Long> {
    
}
