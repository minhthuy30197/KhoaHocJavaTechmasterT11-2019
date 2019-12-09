package com.company;

public class HinhVuong implements TuGiac {
    private int canh;

    public HinhVuong() {

    }

    public HinhVuong(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public void tinhDienTich() {
        System.out.println("Dien tich hinh vuong: "+ canh*canh);
    }

    @Override
    public int tinhChuVi() {
        return canh*4;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Do dai canh: " + canh);
    }
}
