package com.company;

public class TestDog {
    public static void hello() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        hello();

        System.out.println(Dog.TUOI_THO);

        Dog dog3 = new Dog("Hồ Lô", 2);
        dog3.showInfo();
        dog3.age = 10;
        Dog.mauMat = "den";
        dog3.mauMat = "xanh";
        Dog dog4 = new Dog();
        System.out.println(dog4.mauMat); // xanh
        Dog dog5 = new Dog();
        System.out.println(dog5.mauMat); // xanh
        dog4.mauMat = "do";
        System.out.println(Dog.mauMat); // đỏ
        System.out.println(dog3.mauMat);
        Dog.greeting();

        Dog dog = new Dog("Milu", 19, "Đỏ", "Gấu mèo");
        System.out.println(dog.age); // 10
        System.out.println(dog.getColor()); // Vàng
        System.out.println(dog.name);
        System.out.println(dog.getSpecies());

        System.out.println("---------------------------");

        Dog dog2 = new Dog();
        dog2.age = 12;
        dog2.setColor("Trắng");
//        dog2.color = "Trắng";
        dog2.name = "Mèo";
        dog2.setSpecies("Phốc");
//        dog2.species = "Phốc";
//        System.out.println(dog2.age);
//        System.out.println(dog2.color);
//        System.out.println(dog2.name);
//        System.out.println(dog2.species);
//        dog2.showInfo("Heo");
//        System.out.println(dog2.name);
//        dog2.sleep();
//        dog2.eat("rau cải", "milo");
//        String bark = dog2.bark();
//        System.out.println(bark);
//        dog2.run();
//        dog2.calYear();
//
//        int year = dog2.calYear1();
//        System.out.println(year);
        String str = dog2.inChuoi(13);
        System.out.println(str);
    }
}
