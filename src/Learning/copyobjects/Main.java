package Learning.copyobjects;

public class Main {
    public static void main(String[] args) {

        Scooter scooter1 = new Scooter("Chevrolet", "Camaro", 2021);
        //Scooter scooter2 = new Scooter("Ford", "Mustang", 2022);

        Scooter scooter2 = new Scooter(scooter1);

        //scooter2.copy(scooter1);

        System.out.println(scooter1);
        System.out.println(scooter2);
        System.out.println();
        System.out.println(scooter1.getMake());
        System.out.println(scooter1.getModel());
        System.out.println(scooter1.getYear());
        System.out.println();
        System.out.println(scooter2.getMake());
        System.out.println(scooter2.getModel());
        System.out.println(scooter2.getYear());
    }
}