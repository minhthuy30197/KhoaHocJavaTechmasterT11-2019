package com.company;

public class Dog {
    public Dog() {

    }

    public Dog(String name, int age, String color, String species) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Khai báo thuộc tính
    public String name;
    int age = 10; // mặc định
    private String color;
    private String species;

    public static void greeting() {
        System.out.println("I'm a dog");
    }

    // Thuộc tính static
    public static String mauMat;

    // Thuộc tính hằng
    public static final int TUOI_THO = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Validate thông tin
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Khai báo phương thức
    public void eat(String food, String drink) {
        sleep();
        System.out.println("Dog is eating " + food + " and drinking " + drink);
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public String bark() {
        return "Gâu Gâu";
    }

    public void showInfo() {
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " + age);
        System.out.println("Loài: " + species);
        System.out.println("Màu lông: " + color);
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void calYear() {
        int year = 2019 - this.age;
        System.out.println(year);
    }

    public int calYear1() {
        int year = 2019 - age;
        return year;
    }

    public String inChuoi(int i) {
        if (i % 5 == 0) {
            return "Ahihi";
        } else if (i > 10) {
            System.out.println("Ahuhu");
            return "Ahuhu";
        } else {
            System.out.println("Ahehe");
        }

        return "Ahaha";
    }
}
