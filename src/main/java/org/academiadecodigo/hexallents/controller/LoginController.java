package org.academiadecodigo.hexallents.controller;

import org.academiadecodigo.hexallents.service.UserService;
import org.academiadecodigo.hexallents.view.LoginView;


/**
 * Created by codecadet on 20/03/2018.
 */
public class LoginController implements Controller{


    private UserService userService;
    private MenuController menuController;
    private LoginView loginView;

    public void doLogin(String username, String password) {
        if (userService.authenticateUser(username, password)){
            menuController.init();
            return;
        }
        System.out.println("Wrong login");
        loginView.show();
    }



    @Override
    public void init() {
        loginView.show();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }
}
