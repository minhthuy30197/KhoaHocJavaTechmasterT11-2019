package com.company;

import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Java", 20, "Nguyễn Văn A", "Nam", "Hà Nội", 30);
        teacher.showInfo();
        teacher.calculateSalary();
    }
}
