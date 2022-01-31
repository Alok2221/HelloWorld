package Learning.encapsulation;

public class Main {
    public static void main(String[] args) {

        //  Encapsulation = attributes of a class will be hidden or private,
        //                  Can be accessed only through methods (getter & setter)
        //                  You should make attributes private if you don't have a reason to make them public/protected

        Auto auto = new Auto("Chevrolet", "Camaro", 2021);

        auto.setYear(2022);

        System.out.println(auto.getMake());
        System.out.println(auto.getModel());
        System.out.println(auto.getYear());
    }
}