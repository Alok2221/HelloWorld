package Learning.inheritance;

public class Car extends Vehicle {

    int wheels = 4;
    int doors = 4;
    int horsePower = 250;

    void getHorsePower() {
        System.out.println(horsePower + "hp");
    }
}