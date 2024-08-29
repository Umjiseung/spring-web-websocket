package com.web.socket.domain.chatroom;

import com.web.socket.domain.chatroom.dto.ChatRoomDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatRoomController {

    private final ChatRoomRepository chatRoomRepository;


    // 모든 채팅방 목록 반환
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoomDto> room() {
        List<ChatRoomDto> list = chatRoomRepository.findAllRoom();
        return list;
    }


    // 채팅방 생성
    @PostMapping("/room")
    @ResponseBody
    public ChatRoomDto createRoom(@RequestParam String user1, String user2) {
        return chatRoomRepository.createChatRoom(user1, user2);
    }


    // 특정 채팅방 조회
    @GetMapping("/room/{roomId}")
    @ResponseBody
    public ChatRoomDto roomInfo(@PathVariable String roomId) {
        return chatRoomRepository.findRoomById(roomId);
    }
}
