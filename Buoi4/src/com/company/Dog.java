package com.company;

public class Dog extends Animal {
    private String mauLong;
    private int soChan;

    public Dog() {

    }

    public Dog(String ten, String loai, int tuoi, String mauLong, int soChan) {
        super(ten, loai, tuoi);
        this.mauLong = mauLong;
        this.soChan = soChan;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Mau long: " + mauLong);
        System.out.println("So chan: " + soChan);
    }

    public void keu() {
        System.out.println("Gâu gâu");
    }

    public void hienThiTen() {
        System.out.println(ten);
    }
}
