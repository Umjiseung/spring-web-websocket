package com.web.socket.domain.chatroom.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Getter
public class ChatRoomDto {
    private String roomId;
    private String name;

    public static ChatRoomDto create(String name) {
        ChatRoomDto chatRoom = new ChatRoomDto();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}
