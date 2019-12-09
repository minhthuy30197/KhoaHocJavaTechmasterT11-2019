package com.company;

public abstract class DongVat {
    protected String loai;
    protected String ten;
    protected int tuoi;

    public DongVat() {

    }

    public DongVat(String loai, String ten, int tuoi) {
        this.loai = loai;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public abstract void keu();

    public abstract String traVeThucAn();
}
