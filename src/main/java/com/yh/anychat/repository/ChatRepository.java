package com.yh.anychat.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yh.anychat.model.ChatMessage;

@Repository
public interface ChatRepository extends JpaRepository<ChatMessage, Long> {
    // Some Methods for Future Use

    // Fetch messages by sender
    List<ChatMessage> findBySender(String sender);

    // Fetch messages sorted by timestamp (oldest first)
    List<ChatMessage> findAllByOrderByTimestampAsc();

    // Fetch messages sorted by timestamp (newest first)
    List<ChatMessage> findAllByOrderByTimestampDesc();

    // Fetch messages within a specific time range
    List<ChatMessage> findByTimestampBetween(LocalDateTime start, LocalDateTime end);

    // Custom query // Fetch recent messages by sender
    @Query("SELECT c FROM ChatMessage c WHERE c.sender = :sender ORDER BY c.timestamp DESC")
    List<ChatMessage> findRecentMessagesBySender(@Param("sender") String sender);
}
