package com.yh.anychat.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yh.anychat.model.ChatMessage;
import com.yh.anychat.service.ChatService;

@Controller
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatService.saveChatMessage(chatMessage); // will return the saved chat message
        // return chatMessage;
    }

    @GetMapping("chat")
    public String chat() {
        return "chat";
    }

    @GetMapping("/chat/history")
    public ResponseEntity<List<ChatMessage>> viewAllChatMessages() {
        List<ChatMessage> chatMessages = chatService.getAllChatMessages();
        return ResponseEntity.ok(chatMessages);
    }

}
