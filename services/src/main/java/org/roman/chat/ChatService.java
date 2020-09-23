package org.roman.chat;

import org.roman.model.chat.Chat;
import org.roman.model.user.User;

public interface ChatService {

    void createChat(User admin);
    void addParticipant(Chat chat, User participant);
    void removeParticipant(Chat chat, User participant);
}
