package com.LinkUp.LinkUp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private enum MessageType {
        CHAT, LEAVE, JOIN
    }

    private String content;
    private String sender;
    private String recipient;
    private MessageType messageType;
}
