package org.roman.repository;

import org.roman.model.user.User;

import java.util.Set;

public interface UserRepository {

    Set<User> getFriends(long id);
    void addFriend(long toId, long newId);
    void removeFriend(long fromId, long id);
}
