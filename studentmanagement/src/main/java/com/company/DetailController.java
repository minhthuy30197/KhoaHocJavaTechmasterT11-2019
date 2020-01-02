package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DetailController {

    @FXML
    private Button btnBack;

    @FXML
    private TextField tfPhone;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfId;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        App.setRoot("manager");
    }

    @FXML
    void updateInfo(ActionEvent event) {
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        int id = Integer.parseInt(tfId.getText());
        Student std = new Student(id, name, email, phone);
        Repository.updateStudent(std, id);
    }

    void setData(Student std) {
        tfEmail.setText(std.getEmail());
        tfName.setText(std.getName());
        tfId.setText(String.valueOf(std.getId()));
        tfPhone.setText(std.getPhone());
    }

}

