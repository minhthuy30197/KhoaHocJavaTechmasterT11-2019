package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        // Tạo control
        TextField tf = new TextField();
        Button btn = new Button("Xem giờ");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                Date date = new Date();
                System.out.println(date);
                tf.setText(String.valueOf(date));
            }
        } );

        // Tạo layout
        GridPane root = new GridPane();
        root.addRow(0, tf);
        root.addRow(1, btn);

        // Tạo Scene
        Scene scene = new Scene(root, 500, 500);

        stage.setScene(scene);
        stage.setTitle("Xem giờ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}