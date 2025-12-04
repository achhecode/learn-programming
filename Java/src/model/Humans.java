package model;

public class Humans{
    String name;
    int age;
    String address;
    String nationality;
    String height;
    boolean onlyVeg;



    public void run(){
        System.out.println(this.name+ " can run at 20km/h");
    }

    public void speak(){
        System.out.println(this.name+ " can speak Hindi & English");
    }

    public void eat(){
        if (this.onlyVeg){
            System.out.println(this.name+ " eat veg only");
        } else{
            System.out.println(this.name+ " eat non veg and veg both");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public boolean isOnlyVeg() {
        return onlyVeg;
    }

    public void setOnlyVeg(boolean onlyVeg) {
        this.onlyVeg = onlyVeg;
    }

    public Humans(String name, int age, String address, String nationality, String height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
        this.height = height;
    }
}