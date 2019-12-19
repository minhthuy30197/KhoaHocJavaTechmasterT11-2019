package com.company;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Optional;

public class Controller {
    @FXML
    private MenuBar menuBar;

    @FXML
    private TextArea textarea;

    @FXML
    private MenuItem btnSave;

    @FXML
    private MenuItem btnOpen;

    @FXML
    private MenuItem btnExit;

    @FXML
    void Open(ActionEvent event) {
        // Hiển thị file chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        Stage stage = (Stage)(menuBar.getScene().getWindow());
        File file1 = fileChooser.showOpenDialog(stage);
        System.out.println(file1);

        // Đọc file
        String text = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file1));
            String textInALine;
            while ((textInALine = br.readLine()) != null) {
                text = text + textInALine;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Gán vào text area
        textarea.setText(text);
    }

    @FXML
    void Save(ActionEvent event) {
        String text = textarea.getText();
        System.out.println(text);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save As");
        Stage stage = (Stage)(menuBar.getScene().getWindow());
        File file1 = fileChooser.showSaveDialog(stage);

        // Tạo ghi file
        try {
            file1.createNewFile();

            FileWriter writer = new FileWriter(file1);
            writer.write(text);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Exit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete File");
        alert.setHeaderText("Are you sure want to move this file to the Recycle Bin?");
        alert.setContentText("C:/MyFile.txt");
        Optional<ButtonType> option = alert.showAndWait();
        if (option.get() == ButtonType.OK) {
            // Người dùng đã ấn nút OK, thoát ứng dụng
            Platform.exit();
        }
    }

}

