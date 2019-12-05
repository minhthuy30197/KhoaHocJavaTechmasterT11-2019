package com.company;

import javax.swing.*;
import java.util.Date;

public class Student extends Person {
    private String maHocSinh;
    private float diemThi;

    public Student() {
        // Tự động gọi đến Person()
    }

    public Student(String maHocSinh, float diemThi) {
        // Tự động gọi đến Person()
        this.maHocSinh = maHocSinh;
        this.diemThi = diemThi;
    }

    public Student(String hoTen, String gioiTinh, String diaChi, int tuoi, String maHocSinh, float diemThi) {
        super(hoTen, gioiTinh, diaChi, tuoi);
        this.maHocSinh = maHocSinh;
        this.diemThi = diemThi;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Ma hoc sinh: " + maHocSinh);
        System.out.println("Diem thi: " + diemThi);
    }
}
