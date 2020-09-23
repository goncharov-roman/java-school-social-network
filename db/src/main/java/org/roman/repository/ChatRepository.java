package org.roman.repository;

public interface ChatRepository {

    void createChat(long adminId);
    void addParticipant(long chatId, long participantId);
    void removeParticipant(long chatId, long participantId);
}
