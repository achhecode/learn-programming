package test;

import model.Car;
import model.Humans;

public class Test {
    static void main() {
        Car car1 = new Car("Hyundai Eon", "Blue", "V2", 2013);
        System.out.println(car1.getName());
        car1.drive();
        car1.setIs_suv(true);
        car1.check_suv();

        car1.setYear(1874);
        System.out.println(car1.getYear());

        Humans human1 = new Humans("Ramesh", 45, "Cannught Place, Delhi", "Indian", "5'11");
        human1.run();
        human1.setOnlyVeg(false);
        human1.eat();

        Car car2 = new Car("Wagnor");
        car2.setColor("Yellow");
        System.out.println(car2.getColor());
    }
}
