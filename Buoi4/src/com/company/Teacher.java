package com.company;

public class Teacher extends Person {
    private String lopDay;
    private int soGioDay;
    private static int luongMotGioDay = 200000;

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public Teacher() {
        // Tự động gọi đến hàm super() ~ Person()
        super();
    }

    public Teacher(String lopDay, int soGioDay, String hoTen, String gioiTinh, String diaChi, int tuoi) {
        super(hoTen, gioiTinh, diaChi, tuoi);
        this.lopDay = lopDay;
        this.soGioDay = soGioDay;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Lop day: " + lopDay);
        System.out.println("So gio day: " + soGioDay);
    }

    public void calculateSalary() {
        int salary = soGioDay * luongMotGioDay;
        System.out.println("Luong day: " + salary);
    }
}
