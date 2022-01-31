package Learning.inheritance;

public class Bicycle extends Vehicle {

    int wheels = 2;
    int derailleurs = 8;


    void getDerailleurs() {
        System.out.println("This bike have " + derailleurs + " derailleurs");
    }
}