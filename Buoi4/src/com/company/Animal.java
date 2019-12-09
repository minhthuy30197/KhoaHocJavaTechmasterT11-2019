package com.company;

public class Animal {
    protected String ten;
    protected String loai;
    protected int tuoi;

    public Animal() {

    }

    public Animal(String ten, String loai, int tuoi) {
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showInfo() {
        System.out.println("Ten: " + ten);
        System.out.println("Loai: " + loai);
        System.out.println("Tuoi: " + tuoi);
    }

    public void keu() {
        System.out.println("Tôi đang kêu");
    }
}
