package org.academiadecodigo.hexallents.service;

import org.academiadecodigo.hexallents.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 20/03/2018.
 */
public class MockUserService implements UserService {

    private Map<String, User> usersMap;


    public MockUserService() {
        usersMap = new HashMap<>();
    }

    public void addUser(User user) {

        usersMap.putIfAbsent(user.getUsername(), user);
    }

    public void removeUser(User user) {
        usersMap.remove(user.getUsername());
    }

    public User findByName(String username) {
        return usersMap.get(username);
    }

    public boolean authenticateUser(String username, String password) {

        User authenticatedUser = usersMap.get(username);

        return authenticatedUser != null && authenticatedUser.getPassword().equals(password);
    }

    public int count() {
        return usersMap.size();
    }

    public List<User> listUsers() {
        List<User> users = new ArrayList<>(usersMap.values());

        return users;
    }
}
