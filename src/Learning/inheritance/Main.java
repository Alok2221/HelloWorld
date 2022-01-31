package Learning.inheritance;

public class Main {
    public static void main(String[] args) {

        //  inheritance =   the process where one class acquires,
        //                  the attributes and methods of another.

        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        car.speed = 50;
        bike.speed = 12;

        System.out.println(car.speed);
        System.out.println(bike.speed);

        car.getHorsePower();
        bike.getDerailleurs();
    }
}
