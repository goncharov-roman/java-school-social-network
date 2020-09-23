package org.roman.repository;

import org.roman.model.user.User;

import java.util.Collections;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public Set<User> getFriends(long id) {
        return Collections.emptySet();
    }

    @Override
    public void addFriend(long toId, long newId) {}

    @Override
    public void removeFriend(long fromId, long id) {}
}
