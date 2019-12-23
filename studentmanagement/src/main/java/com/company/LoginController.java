package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField tfPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField tfUsername;

    @FXML
    void login(ActionEvent event) throws IOException {
        App.setRoot("manager");
        App.stage.setTitle("Quản lý sinh viên");
    }

}
