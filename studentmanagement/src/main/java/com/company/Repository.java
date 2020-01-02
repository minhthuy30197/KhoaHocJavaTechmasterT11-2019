package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Repository {
    private static ObservableList<Student> list = FXCollections.observableArrayList();

    // Thông tin kết nối database
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/test?useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static ObservableList<Student> getList() {
        // Xóa toàn bộ phần tử trong mảng
        list.clear();

        try {
            // Tạo kết nối đến database
            Connection conn = null;
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

            // Tạo statement
            // Sử dụng để thực hiện các câu truy vấn SQL tĩnh (select)
            Statement stmt = conn.createStatement();

            // Lấy toàn bộ dữ liệu từ bảng users
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Chuyển dữ liệu vào ArrayList
            while (rs.next()) {
                Student std = new Student();
                std.setEmail(rs.getString("email"));
                std.setPhone(rs.getString("phone"));
                std.setName(rs.getString("name"));
                std.setId(rs.getInt("id"));

                list.add(std);
            }

            // Đóng kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public static void addStudent(Student std) {
        try {
            // Tạo kết nối đến database
            Connection conn = null;
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

            // Tạo PreparedStatement
            // Sử dụng để thực hiện các  câu truy vấn SQL động (insert, update, delete)
            // hoặc có tham số
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO student(id, name, email, phone) VALUE (DEFAULT, ?, ?, ?)");

            // Gán tham số
            stmt.setString(1, std.getName());
            stmt.setString(2, std.getEmail());
            stmt.setString(3, std.getPhone());

            // Thực thi câu lệnh
            stmt.execute();

            // Render lai phan tu trong bang
            getList();

            // Đóng kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void removeStudent(Student std) {
        try {
            // Tạo kết nối đến database
            Connection conn = null;
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

            // Tạo PreparedStatement
            // Sử dụng để thực hiện các  câu truy vấn SQL động (insert, update, delete)
            // hoặc có tham số
            PreparedStatement  stmt = conn.prepareStatement("DELETE FROM student WHERE id = ?");

            // Gán tham số
            stmt.setInt(1, std.getId());

            // Thực thi câu lệnh
            stmt.execute();

            // Xóa phần tử khỏi bảng
            list.remove(std);

            // Đóng kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void updateStudent(Student std, int id) {
        try {
            // Tạo kết nối đến database
            Connection conn = null;
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

            // Tạo PreparedStatement
            // Sử dụng để thực hiện các  câu truy vấn SQL động (insert, update, delete)
            // hoặc có tham số
            PreparedStatement  stmt = conn.prepareStatement("UPDATE student SET name = ?, email = ?, phone = ? WHERE id = ?");

            // Gán tham số
            stmt.setString(1, std.getName());
            stmt.setString(2, std.getEmail());
            stmt.setString(3, std.getPhone());
            stmt.setInt(4, std.getId());

            // Thực thi câu lệnh
            stmt.execute();

            // Load lại dữ liệu bảng
            getList();

            // Đóng kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
