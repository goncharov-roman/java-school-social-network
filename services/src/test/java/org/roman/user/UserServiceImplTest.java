package org.roman.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.roman.model.user.User;
import org.roman.repository.UserRepository;

import java.util.Collections;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    UserService userService;
    @Mock
    UserRepository userRepository;

    @Before
    public void setUp() {
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void getFriends() {
        final long id = 1;

        when(userRepository.getFriends(id)).thenReturn(Collections.<User>emptySet());

        userService.getFriends(id);

        verify(userRepository).getFriends(id);
    }

    @Test
    public void addFriend() {
        User user = new User(0,"User1", 30, "Address1");
        User newUser = new User(1, "User2", 30, "Address2");

        doNothing().when(userRepository).addFriend(user.getId(), newUser.getId());

        userService.addFriend(user, newUser);

        verify(userRepository).addFriend(user.getId(), newUser.getId());
    }

    @Test
    public void removeFriend() {
        User user = new User(0,"User1", 30, "Address1");
        User friend = new User(1, "User2", 30, "Address2");

        doNothing().when(userRepository).removeFriend(user.getId(), friend.getId());

        userService.removeFriend(user, friend);

        verify(userRepository).removeFriend(user.getId(), friend.getId());
    }
}