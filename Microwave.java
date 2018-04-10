package com.company;

public class Microwave extends Computer {
    private int power;
    private int time;

    public Microwave(String name, boolean status) {
        super(name, status);


    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public int getPower() {
        return power;
    }

    public void showInfo() {
        System.out.println("Microwave name : " + getName() + "\nStatus: " + getStatus() + "\nPower: " + getPower() +
                "\nTime: " + getTime());
    }

    public void choosePower(String choice) {

        switch (choice) {
            case "a":
                setPower(500);
                System.out.println(" Power is set to 500");
                break;
            case "b":
                setPower(750);
                System.out.println("Power is set to 750");
                break;
            case "c":
                setPower(850);
                System.out.println("Power is set to 850");
                break;
            default:
                setPower(250);
                System.out.println("Default power is 250");
                break;
        }
    }

    public void checkTimeAndPower() {

        if (getPower() == 500) {
            System.out.println("Max time is 60 s");
            setTime(60);
        }
        else if (getPower() == 750) {
            System.out.println("Max time is 50s");
            setTime(50);
        }
        else if (getPower() == 850) {
            System.out.println("Max time is 40s");
            setTime(40);

        }
        else {
            System.out.println("Max time is 70s");
            setTime(70);
        }

    }
}

