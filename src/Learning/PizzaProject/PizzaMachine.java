package Learning.PizzaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaMachine {
    public static void main(String[] args) {

        System.out.println("Welcome");


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