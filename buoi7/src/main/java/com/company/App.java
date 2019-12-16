package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label lb = new Label("Hôm nay là thứ 2");
        Button btn = new Button("My Button");
        Button btn1 = new Button("Mai là ngày thứ 3, 17/12/2019");
        Label lb1 = new Label("Xin chào các bạn Xin chào các bạn Xin chào các bạn Xin chào các bạn");
//
//        StackPane root  = new StackPane();
//        root.getChildren().add(lb);
//        root.getChildren().add(btn);
//        root.getChildren().add(btn1);

//        BorderPane root = new BorderPane();
//        root.setTop(lb);
//        root.setBottom(btn);
//        root.setRight(btn1);
//        root.setRight(lb1);

//        VBox root = new VBox();
//        root.getChildren().addAll(lb, btn, lb1, btn1);

        Label first_name=new Label("First Name First Name");
        Label last_name=new Label("Last Name");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        Button Submit=new Button ("Submit");
        GridPane root=new GridPane();
        root.addRow(0, first_name,tf1);
        root.addRow(5, Submit);
        root.addRow(1, last_name,tf2);

        Scene scene = new Scene(root, 640, 480);

        stage.setScene(scene);
        stage.setTitle("Hôm nay là thứ mấy");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}