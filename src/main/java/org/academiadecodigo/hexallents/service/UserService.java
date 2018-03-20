package org.academiadecodigo.hexallents.service;

import org.academiadecodigo.hexallents.model.User;

import java.util.List;

/**
 * Created by codecadet on 20/03/2018.
 */
public interface UserService {

    void addUser(User user);

    void removeUser(User user);

    User findByName(String username);

    boolean authenticateUser(String username, String password);

    int count();

    List<User> listUsers();


}
