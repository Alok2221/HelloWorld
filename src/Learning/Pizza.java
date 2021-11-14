package Learning;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;
    String topping1;
    String topping2;
    String topping3;

    Pizza(String bread, String sauce, String cheese, String topping1, String topping2, String topping3) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
    }

    Pizza(String bread, String sauce, String cheese, String topping1, String topping2) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping1 = topping1;
        this.topping2 = topping2;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {

        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread) {

        this.bread = bread;
    }
}