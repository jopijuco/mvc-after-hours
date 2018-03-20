package org.academiadecodigo.hexallents;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.hexallents.view.LoginView;

/**
 * Created by codecadet on 20/03/2018.
 */
public class TestView {

    public static void main(String[] args) {

    Prompt prompt = new Prompt(System.in, System.out);
    LoginView loginView = new LoginView(prompt);
    loginView.show();




    }




}
