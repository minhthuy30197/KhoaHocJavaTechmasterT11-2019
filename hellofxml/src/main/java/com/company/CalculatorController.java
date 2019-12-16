package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField tf3;

    @FXML
    private TextField tf2;

    @FXML
    private Label lb1;

    @FXML
    private Label title;

    @FXML
    private Label lb2;

    @FXML
    private Button btn;

    @FXML
    private TextField tf1;

    @FXML
    void calculate(ActionEvent event) {
        String text1 = tf1.getText();
        String text2 = tf2.getText();
        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int sum = num1 + num2;
        tf3.setText(String.valueOf(sum));
    }

}
