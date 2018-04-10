package com.company;

public class CoffeeMachine extends Computer {
    private int temperature;
    private int waterAmount;
    private int milkAmount;
    private int sugarAmount;
    private int coffieAmount;


    public CoffeeMachine(String name, boolean status) {
        super(name, status);


    }

    public void showInfo() {
        System.out.println("Name is :" + getName() + "\nStatus is : " + getStatus() + "\nCoffie Temperature: "
                + getTemperature());
    }

    public void showInfoAboutCoffie() {
        System.out.println("Amount of milk: " + getMilkAmount() + "\nAmount of water: " + getWaterAmount() +
                "\nAmount of Sugar: " + getSugarAmount() + "\nAmount of Coffie: " + getCoffieAmount());
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public int getMilkAmount() {
        return milkAmount;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public int getCoffieAmount() {
        return coffieAmount;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public void setMilkAmount(int milkAmount) {
        this.milkAmount = milkAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public void setCoffieAmount(int coffieAmount) {
        this.coffieAmount = coffieAmount;
    }


    public void prepareCoffe(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Preparing - Cappucino coffee");
                setMilkAmount(20);
                setSugarAmount(10);
                setWaterAmount(30);
                setCoffieAmount(20);
                setTemperature(90);
                break;
            case 2:
                System.out.println("Preparing - Latte Machiato");
                setMilkAmount(30);
                setSugarAmount(10);
                setWaterAmount(20);
                setCoffieAmount(25);
                setTemperature(85);
                break;
            case 3:
                System.out.println("Preparing - Espresso");
                setMilkAmount(10);
                setSugarAmount(10);
                setWaterAmount(10);
                setCoffieAmount(40);
                setTemperature(78);
                break;

        }
    }
}
