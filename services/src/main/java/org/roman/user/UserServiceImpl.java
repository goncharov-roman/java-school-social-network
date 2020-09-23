package org.roman.user;

import org.roman.model.user.User;
import org.roman.repository.UserRepository;

import java.util.Set;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Set<User> getFriends(long id) {
        return userRepository.getFriends(id);
    }

    public void addFriend(User to, User friend) {
        userRepository.addFriend(to.getId(), friend.getId());
    }

    public void removeFriend(User from, User friend) {
        userRepository.removeFriend(from.getId(), friend.getId());
    }
}
