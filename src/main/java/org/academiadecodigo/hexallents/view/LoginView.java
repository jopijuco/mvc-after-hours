package org.academiadecodigo.hexallents.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.hexallents.controller.LoginController;

/**
 * Created by codecadet on 20/03/2018.
 */
public class LoginView implements View {


    private Prompt prompt;
    private LoginController loginController;



    public LoginView(Prompt prompt) {
        this.prompt = prompt;
    }


    @Override
    public void show() {
        StringInputScanner askUsername = new StringInputScanner();
        askUsername.setMessage("Username: ");

        StringInputScanner askPassword = new StringInputScanner();
        askPassword.setMessage("Password: ");


        String username = prompt.getUserInput(askUsername);
        String password = prompt.getUserInput(askPassword);

        loginController.doLogin(username, password);

    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
}
