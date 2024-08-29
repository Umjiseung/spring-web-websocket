package com.web.socket.domain.chatroom;

import com.web.socket.domain.chatroom.dto.ChatRoomDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ChatRoomRepository {

    private Map<String, ChatRoomDto> chatRoomMap;

    @PostConstruct
    private void init() {
        chatRoomMap = new LinkedHashMap<>();
    }

    public List<ChatRoomDto> findAllRoom() {
        List chatRooms = new ArrayList<>(chatRoomMap.values());
        Collections.reverse(chatRooms);     //최신 순으로 정렬
        return chatRooms;
    }

    public ChatRoomDto findRoomById(String id) {
        return chatRoomMap.get(id);
    }

    public ChatRoomDto createChatRoom(String name) {
        ChatRoomDto chatRoom = ChatRoomDto.create(name);
        chatRoomMap.put(chatRoom.getRoomId(), chatRoom);
        return chatRoom;
    }
}