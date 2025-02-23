package com.yh.anychat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yh.anychat.model.ChatMessage;
import com.yh.anychat.repository.ChatRepository;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public List<ChatMessage> getAllChatMessages() {
        return chatRepository.findAll();
    }

    public ChatMessage saveChatMessage(ChatMessage chatMessage) {
        return chatRepository.save(chatMessage);
    }

}
