package com.company;

public class Dog extends DongVat implements Runnable{
    @Override
    public void keu() {
        System.out.println("Gâu gâu");
    }

    @Override
    public String traVeThucAn() {
        return "xuong";
    }

    @Override
    public void chay() {
        System.out.println("Toc do chay cua cho: " + tocDo);
    }

    @Override
    public void sleep() {
        System.out.println("Toi dang ngu");
    }
}
