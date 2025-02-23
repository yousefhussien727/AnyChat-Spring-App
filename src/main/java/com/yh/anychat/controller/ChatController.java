package com.yh.anychat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yh.anychat.model.ChatMessage;


@Controller
public class ChatController {
    

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatMessage;
    }

    @GetMapping("chat")
    public String chat() {
        return "chat";
    }
    
}
