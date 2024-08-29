package com.web.socket.domain.chat.dto;

import com.web.socket.domain.chat.MessageType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ChatMessage {
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
}
