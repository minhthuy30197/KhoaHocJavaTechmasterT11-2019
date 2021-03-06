package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField tfPhone;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfEmail;

    @FXML
    private Button btnDetail;

    @FXML
    private TableView<Student> table;

    @FXML
    private TableColumn<Student, String> phoneColumn;

    @FXML
    private TableColumn<Student, Integer> idColumn;

    @FXML
    private TableColumn<Student, String> emailColumn;

    @FXML
    void addNewStudent(ActionEvent event) {
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        Student std = new Student(name, email, phone);

        Repository.addStudent(std);

        // Reset textfield
        tfEmail.setText("");
        tfPhone.setText("");
        tfName.setText("");
    }

    @FXML
    void getDetail(ActionEvent event) throws IOException {
        // Chọn hàng cần xem chi tiết
        Student std = table.getSelectionModel().getSelectedItem();
        if (std != null) {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("detail.fxml"));
            Parent parent = fxmlLoader.load();
            DetailController controller = fxmlLoader.getController();
            controller.setData(std);
            App.setScene(new Scene(parent));
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Cảnh báo");
            alert.setHeaderText("Không hợp lệ");
            alert.setContentText("Vui lòng chọn sinh viên cần xem chi tiết");
            alert.showAndWait();
        }
    }

    @FXML
    void deleteStudent(ActionEvent event) {
        // Chọn hàng cần xóa
        Student std = table.getSelectionModel().getSelectedItem();
        if (std != null) {
            // Xóa phần tử trong mảng
            Repository.removeStudent(std);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Cảnh báo");
            alert.setHeaderText("Không hợp lệ");
            alert.setContentText("Vui lòng chọn sinh viên cần xóa");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Khởi tạo giá trị cho bảng
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("phone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        idColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));

        table.setItems(Repository.getList());
    }
}
