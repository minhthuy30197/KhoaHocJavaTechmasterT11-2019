package com.company;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        DongVat dv1 = new Cat();
//        DongVat dv2 = new Dog();
//        dv1.keu();
//        dv2.keu();
//        System.out.println(dv1.traVeThucAn());
//        System.out.println(dv2.traVeThucAn());
//        ((Dog) dv2).chay();
//
//        Dog dv3 = new Dog();
//        dv3.chay();
//
//        Runnable run1 = new Dog();

        ArrayList<String> hoa = new ArrayList<String>();
        hoa.add("Hoa Hong");
        hoa.add("Hoa Lan");
        hoa.add("Hoa Hue");
        hoa.add("Hoa Hong");
        System.out.println(hoa);
        // Lấy giá trị phần tử theo index
        System.out.println(hoa.get(1));
        //System.out.println(hoa.get(10));
        // Thay giá trị của phần tử
        hoa.set(2, "Hoa Cuc");
        System.out.println(hoa);
        // Lấy độ dài mảng
        System.out.println(hoa.size());
        // Xóa 1 phẩn tử
//        String ketqua = hoa.remove(1);
//        System.out.println(ketqua);
//        System.out.println(hoa);
//        boolean ketqua = hoa.remove("Hoa Hong 123");
//        System.out.println(hoa);
//        System.out.println(ketqua);
        // Xóa tất cả phần tử
        ArrayList<String> mangCanXoa = new ArrayList<String>();
        mangCanXoa.add("Hoa Lan");
        mangCanXoa.add("Hoa Cuc");
        hoa.removeAll(hoa);
        System.out.println(hoa);

        // Xóa hết phần tử
        hoa.clear();
    }
}
