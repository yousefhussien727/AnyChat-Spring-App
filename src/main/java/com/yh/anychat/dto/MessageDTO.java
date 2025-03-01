package com.yh.anychat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MessageDTO {
    private String sender;
    private String content;
    private Long chatRoomId; // Only send the ChatRoom ID instead of full object
}
