package com.company;

public class HinhChuNhat implements TuGiac {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {

    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhDienTich() {
        System.out.println("Dien tich hinh chu nhat: " + chieuDai*chieuRong);
    }

    @Override
    public int tinhChuVi() {
        return (chieuDai+chieuRong)*2;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
    }

    public boolean kiemTraHinhVuong() {
//        if (chieuRong == chieuDai) {
//            return true;
//        }
//
//        return false;
        return (chieuRong == chieuDai) ? true : false;
    }
}
