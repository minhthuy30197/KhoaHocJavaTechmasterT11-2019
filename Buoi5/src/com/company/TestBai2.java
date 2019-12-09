package com.company;

import java.util.ArrayList;

public class TestBai2 {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(20, 5);
        System.out.println(hcn.tinhChuVi());
        hcn.tinhDienTich();
        System.out.println(hcn.kiemTraHinhVuong());

        HinhVuong hv = new HinhVuong(5);
        System.out.println(hv.tinhChuVi());
        hv.tinhDienTich();

        HinhVuong hv2 = new HinhVuong(8);
        hv2.tinhDienTich();
        System.out.println(hv2.tinhChuVi());

        ArrayList<TuGiac> arr = new ArrayList<TuGiac>();
        arr.add(hcn);
        arr.add(hv);
        arr.add(hv2);
        // Cách 1 duyệt mảng
        for (int i=0; i<arr.size(); i++) {
            arr.get(i).hienThiThongTin();
        }
        // Cách 2 duyệt mảng
        int maxCV = arr.get(0).tinhChuVi();
        for (TuGiac tg : arr) {
            if (maxCV < tg.tinhChuVi()) {
                maxCV = tg.tinhChuVi();
            }
        }
        System.out.println("Gia tri chu vi lon nhat: " + maxCV);
    }
}
