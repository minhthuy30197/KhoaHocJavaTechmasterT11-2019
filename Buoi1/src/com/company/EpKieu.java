package com.company;

public class EpKieu {
    public static void main(String[] args) {
        int i = 44;
        float f = 98.42f;
        double d = 103.67;

        f = (float) i;
        System.out.println(f); // 44.0
        d = (double) f;
        System.out.println(d); //  44.0
        i = (int) d; // Ép kiểu từ double về int
        System.out.println(i);
    }
}
