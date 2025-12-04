package model;

public class Car{
    private String name;
    private String color;
    private String model;
    private int year;
    private boolean is_suv = false;

    public void drive(){
        System.out.println(this.name+" is driving");
    }

    public void speed(){
        System.out.println("Speeding the car");
    }



    public void beep() {
        System.out.println("Beep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.name +" color is "+color+".";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1500 && year <= 2025){
            this.year = year;
        }else {
            throw new IllegalArgumentException("Invalid Values");
        }

    }

    public boolean isIs_suv() {
        return is_suv;
    }

    public void setIs_suv(boolean is_suv) {
        this.is_suv = is_suv;
    }

    public void check_suv() {
        if (this.is_suv) {
            System.out.println("Yes, " + this.name + " is a SUV car");
        }else {
            System.out.println("No, " + this.name + " is not a SUV car");
        }
    }

    public Car(String name, String color, String model, int year) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public Car(String name) {
        this.name = name;
    }

}