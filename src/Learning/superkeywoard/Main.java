package Learning.superkeywoard;

public class Main {
    public static void main(String[] args) {

        // super =  keyword refers to the superclass (parent) of an object
        //          very similar to the "this" keyword

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 45, "everything");

        System.out.println(hero1);
        System.out.println();
        System.out.println(hero2);
    }
}