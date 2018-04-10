package com.company;


public class Main {

    public static void main(String args[]) {

        Device device1 = new Device("NoName", 30, true);
        device1.showInfo();
        device1.checkWeight();
        System.out.println("------------------------------------------------------");

        Computer Laptop = new Computer("Lenovo", 50, true, 2001, 1024, true, 70, 80);
        Laptop.showInfo();
        Laptop.regulateTemperatrue();

        Laptop.coolerStatus();
        System.out.println("------------------------------------------------------");

        Microwave samsung = new Microwave("Samsung", true);
        samsung.choosePower("b");
        samsung.checkTimeAndPower();
        samsung.showInfo();

        System.out.println("-------------------------------------------------------");
        CoffeeMachine sega = new CoffeeMachine("Sega", true);

        System.out.println();
        sega.prepareCoffe(1);

        sega.showInfoAboutCoffie();
        sega.showInfo();
        System.out.println("-------------------------------------------------------");
        Washingmachine beko = new Washingmachine("Beko");
        beko.showName();
        beko.setStatus(true);
        beko.getStatus();
        beko.showInfo();


    }
}
