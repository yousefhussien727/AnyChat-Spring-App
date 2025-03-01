package com.yh.anychat.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yh.anychat.model.ChatRoom;
import com.yh.anychat.repository.RoomRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor // Automatically generates the constructor
public class RoomService {
    private RoomRepository roomRepository;

    // Fetching all chat rooms
    public List<ChatRoom> getAllChatRooms() {
        return roomRepository.findAll();
    }

    // Saving chat room
    @Transactional // for Data Integrity
    public ChatRoom saveChatRoom(ChatRoom chatRoom) {
        return roomRepository.save(chatRoom);
    } 
}
