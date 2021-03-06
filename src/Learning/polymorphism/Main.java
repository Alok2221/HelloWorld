package Learning.polymorphism;

public class Main {
    public static void main(String[] args) {

        //  polymorphism =  greek word for poly- "many", -morph "form"
        //                  The ability of an object to identify as more than one type

        Plane plane = new Plane();
        Bus bus = new Bus();
        Boat boat = new Boat();

        Vehicle[] racers = {plane, bus, boat};

        for (Vehicle x : racers) {
            x.go();
        }
    }
}