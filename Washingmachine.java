package com.company;


import java.util.Scanner;

public class Washingmachine extends Device {


    public int temperature;
    public int speed;

    public Washingmachine(String name) {
        super(name);

    }

    public void showName() {
        System.out.println("Name of washingmachine: " + getName());
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void showInfo() {
        System.out.println("Speed: " + getSpeed() + "\nTemperature :" + getTemperature());
    }

    public int getSpeed() {
        return speed;
    }

    public void setStatus(boolean status) {

        if (status == true) {
            System.out.println("Select your program: 1 or 2 ");
            int choice;
            Scanner putChoice = new Scanner(System.in);
            choice = putChoice.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("Quick Wasching");
                    setTemperature(50);
                    setSpeed(40);
                    break;
                case 2:
                    System.out.println("Economy Wasching");
                    setTemperature(30);
                    setSpeed(90);
                    break;
                default:
                    System.out.println("Default program");
                    setSpeed(50);
                    setTemperature(50);


            }
        }
    }
}























