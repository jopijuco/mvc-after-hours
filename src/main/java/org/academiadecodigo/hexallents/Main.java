package org.academiadecodigo.hexallents;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.hexallents.controller.LoginController;
import org.academiadecodigo.hexallents.controller.MenuController;
import org.academiadecodigo.hexallents.model.User;
import org.academiadecodigo.hexallents.service.MockUserService;
import org.academiadecodigo.hexallents.service.UserService;
import org.academiadecodigo.hexallents.view.LoginView;

/**
 * Created by codecadet on 20/03/2018.
 */
public class Main {

    public static void main(String[] args) {

        User user = new User("arita", "guna", "arita@bulhao.pt");
        UserService userService = new MockUserService();

        userService.addUser(user);

        Prompt prompt = new Prompt(System.in, System.out);
        LoginView loginView = new LoginView(prompt);
        LoginController loginController = new LoginController();
        MenuController menuController = new MenuController();

        loginController.setLoginView(loginView);
        loginController.setMenuController(menuController);
        loginController.setUserService(userService);

        loginView.setLoginController(loginController);

        loginController.init();


    }
}
