package com.company;

public class Computer extends Device {
    private int processorSpeed;
    private int ramSize;
    private boolean wifi;
    private int coolerSpeed;
    private int temperature;

    public Computer(String name, int weight, boolean status, int processorSpeed, int ramSize, boolean wifi,
                    int coolerSpeed, int temperature) {
        super(name, weight, status);
        this.processorSpeed = processorSpeed;
        this.ramSize = ramSize;
        this.wifi = wifi;
        this.coolerSpeed = coolerSpeed;
        this.temperature = temperature;

    }

    public Computer(String name, boolean status) {
        super(name, status);
    }


    public void showInfo() {
        System.out.println("Computer name:  " + getName() + "\nWeight: " + getWeight() + "\n" + "Status: " + getStatus()
                + "\nProcessor speed: " + getProcessorSpeed() + "\nRam size: " + getRamSize() + "\nWifi status :"
                + getWifiStatus() + "\nDefault cooler speed: " + getCoolerSpeed() + "\nDefault Temperature : " + getTemperature());
    }


    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public boolean getWifiStatus() {
        return wifi;
    }

    public int getCoolerSpeed() {
        return coolerSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void coolerStatus() {
        if (processorSpeed > 2000) {
            coolerSpeed = coolerSpeed + 50;

            System.out.println("Cooler Speed was increased: " + coolerSpeed);
        } else {
            System.out.println("Cooler Speed is the same");
        }
    }

    public void regulateTemperatrue() {
        if (getTemperature() >= 80) {
            for (int temperature = getTemperature(); temperature >= 50; temperature--)
                setTemperature(temperature);
            System.out.println("Temperature was decreased to: " + getTemperature());


        }

    }
}


