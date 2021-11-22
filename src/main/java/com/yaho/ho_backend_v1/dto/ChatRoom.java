package com.yaho.ho_backend_v1.dto;

import com.yaho.ho_backend_v1.service.chat.ChatService;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.socket.WebSocketSession;

import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
public class ChatRoom {
    private String roomId;

    @Size(min = 2,max = 15)
    private String name;
    private Set<WebSocketSession> sessions = new HashSet<>();

    @Builder
    public ChatRoom(String roomId, String name) {
        this.roomId = roomId;
        this.name = name;
    }

    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService) {
        if (chatMessage.getType().equals(ChatMessage.MessageType.ENTER)) {
            sessions.add(session);
            chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
        }
        sendMessage(chatMessage, chatService);
    }

    public <T> void sendMessage(T message, ChatService chatService) {
        sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message));
    }
}
