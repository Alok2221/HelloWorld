package Learning.PizzaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaMachine {

    public static void main(String[] args) {


        String none = "without the sauce";
        String marinara = "Marinara sauce";
        String garlic = "Garlic sauce";
        String bbq = "BBQ sauce";
        String cream = "Sour Cream sauce";

        ArrayList<String> sauce = new ArrayList<String>();
        sauce.add(marinara);
        sauce.add(none);
        sauce.add(garlic);
        sauce.add(bbq);
        sauce.add(cream);

        print(getMeats());
        print(getBase());

        System.out.println("Hello it is your digital pizza making machine!!! ");
        System.out.println("Make your very own pizza ");
        System.out.println("Firstly choose pizza base from the list by typing the number of base:  ");

        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
//        System.out.println("Ok so you want " + base.get(number - 1));
//        System.out.println("Now choose sauce you want on your pizza  ");

        System.out.println("1 " + sauce.get(0));
        System.out.println("2 " + sauce.get(1));
        System.out.println("3 " + sauce.get(2));
        System.out.println("4 " + sauce.get(3));
        System.out.println("5 " + sauce.get(4));

        Scanner scanner1 = new Scanner(System.in);
        int number1;
        number1 = scanner1.nextInt();

//        System.out.println("You chose " + base.get(number - 1) + " pizza with " + sauce.get(number1 - 1));
//        System.out.println("What meat toppings would you like? ");

        Scanner scanner2 = new Scanner(System.in);
        int number2;
        number2 = scanner2.nextInt();

        int number3;
        Scanner scanner3 = new Scanner(System.in);
        number3 = scanner3.nextInt();

        System.out.println("Do you want any more toppings? ");
        System.out.println("Type 'letter' if you want more toppings, or 'number' if you good.  ");

    }

    private static void print(List<? extends Enum<?>> enums) {
        for (int i = 0; i < enums.size(); i++) {
            System.out.println(i + 1 + ". " + enums.get(i).toString());
        }
    }

    private static List<Base> getBase() {
        return List.of(
                Base.STUFFED_CRUST,
                Base.CRACKER_CRUST,
                Base.FLAT_BREAD_CRUST,
                Base.THIN_CRUST,
                Base.CHEESE_CRUST_PIZZA,
                Base.WRAPPING_IT_UP);
    }

    private static List<Meats> getMeats() {
        return List.of(
                Meats.PEPPERONI,
                Meats.HAM,
                Meats.PARMA_HAM,
                Meats.BACON,
                Meats.SAUSAGE,
                Meats.CHICKEN,
                Meats.GYROS,
                Meats.BEEF,
                Meats.WITHOUT_MEAT);
    }

    private static List<Veggies> getVeggies() {
        return List.of(
                Veggies.MUSHROOM,
                Veggies.CORN,
                Veggies.PEPPERS,
                Veggies.ONION,
                Veggies.GREEN_OLIVES,
                Veggies.BLACK_OLIVES,
                Veggies.TOMATO,
                Veggies.BROCCOLI,
                Veggies.GARLIC,
                Veggies.CHILLI_PEPPERS,
                Veggies.NO_VEGETABLES
        );
    }
}