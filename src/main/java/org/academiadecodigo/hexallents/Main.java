package org.academiadecodigo.hexallents;

import org.academiadecodigo.hexallents.model.User;
import org.academiadecodigo.hexallents.service.MockUserService;
import org.academiadecodigo.hexallents.service.UserService;

/**
 * Created by codecadet on 20/03/2018.
 */
public class Main {

    public static void main(String[] args) {

        UserService userService = new MockUserService();

        User user = new User("arita", "guna", "ritinha@bolhao.pt");
        User user1 = new User("tioco", "SCPsempre", "tioco@sporting.pt");
        User user2 = new User("diabinha", "bjzoka", "diabinha@macau.com");
        User user3 = new User("arita","caxinas", "coentrao@sempre.pt");

        System.out.println("Before adding users " + userService.count());
        userService.addUser(user);
        System.out.println("After adding one " + userService.count());
        userService.addUser(user1);
        System.out.println("After adding two " + userService.count());
        userService.addUser(user2);
        System.out.println("After adding three " + userService.count());

        System.out.println("Should return arita " + userService.findByName("arita"));

        System.out.println("List users " + userService.listUsers());
        userService.removeUser(user1);
        System.out.println("Should return 2 " + userService.count());
        System.out.println("Should return null " + userService.findByName("tioco"));

        System.out.println("Should return true " + userService.authenticateUser("diabinha", "bjzoka"));
        System.out.println("Should return false " + userService.authenticateUser("diabinha", "bjz0ka"));
        System.out.println("Should return false " + userService.authenticateUser("dibinha", "bjzoka"));

        System.out.println("List users " + userService.listUsers());

        userService.addUser(user3);
        System.out.println("Email should be bolhao " + userService.findByName("arita"));


    }

}
