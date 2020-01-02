package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Repository {
    private static ObservableList<Student> list = FXCollections.observableArrayList(
            new Student(1, "Nguyễn Văn A", "nguyenvana@gmail.com", "0946796365"),
            new Student(2, "Phan Văn B", "phanvanb@gmail.com", "0987654321"),
            new Student(3, "Lưu Thị C", "luuthic@gmail.com", "0916016953")
    );

    public static ObservableList<Student> getList() {
        return list;
    }

    public static void addStudent(Student std) {
        list.add(std);
    }

    public static void removeStudent(Student std) {
        list.remove(std);
    }

    public static void updateStudent(Student std, int id) {
        for (Student item : list) {
            if (item.getId() == id) {
                item.setPhone(std.getPhone());
                item.setEmail(std.getEmail());
                item.setName(std.getName());
            }
        }
    }
}
