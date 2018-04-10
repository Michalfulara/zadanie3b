package com.company;

public class Device {


    //fields
    private String name;
    private int weight;
    private boolean status;

    //constructor
    public Device(String name, int weight, boolean status) {
        this.name = name;
        this.weight = weight;
        this.status = status;
    }

    public Device(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public Device(String name) {
        this.name = name;

    }


    public String getName() {
        return name;

    }

    public int getWeight() {
        return weight;

    }

    public boolean getStatus() {
        return status;
    }


    public void showInfo() {
        System.out.println("Name of device is : " + getName() + " \nWeight: " + getWeight() + "\nStatus: " + getStatus());
    }

    public void checkWeight() {
        if (getName() == "NoName")
            System.out.println("Name is correct");
        else {
            System.out.println("Name is incorrect");
        }
    }
}
