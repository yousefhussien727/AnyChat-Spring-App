package com.yh.anychat.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yh.anychat.model.ChatMessage;
import com.yh.anychat.repository.MessageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor // Automatically generates the constructor
public class MessageService {
    private final MessageRepository chatRepository;

    // Fetching all chat messages
    public List<ChatMessage> getAllChatMessages() {
        return chatRepository.findAll();
    }

    // Saving chat message from Sender
    @Transactional // for Data Integrity
    public ChatMessage saveChatMessage(ChatMessage chatMessage) {
        return chatRepository.save(chatMessage);
    }

}
