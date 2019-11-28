package com.company;

public class TachSo {
    public static void main(String[] args) {
        int a = 12345;

        do {
            System.out.println(a%10);
            a = a / 10;
        } while (a>0);
    }
}
