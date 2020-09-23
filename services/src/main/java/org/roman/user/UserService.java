package org.roman.user;

import org.roman.model.user.User;
import java.util.Set;

public interface UserService {

    Set<User> getFriends(long id);
    void addFriend(User to, User friend);
    void removeFriend(User from, User friend);
}
