package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Date;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label title = new Label("Siêu máy tính");
        Label lb1 = new Label(" + ");
        Label lb2 = new Label(" = ");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        Button btn = new Button("Tính tổng");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                String text1 = tf1.getText();
                String text2 = tf2.getText();
                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);
                int sum = num1 + num2;
                tf3.setText(String.valueOf(sum));
            }
        } );

        GridPane root = new GridPane();
        root.addRow(0, title);
        root.addRow(1, tf1, lb1, tf2, lb2, tf3);
        root.addRow(3, btn);

        Scene scene = new Scene(root, 500, 200);

        stage.setTitle("My calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}