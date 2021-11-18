package Learning.PizzaProject;

public enum Veggies {
    MUSHROOM("Mushroom"),
    CORN("Corn"),
    PEPPERS("Peppers"),
    ONION("Onion"),
    GREEN_OLIVES("Green olives"),
    BLACK_OLIVES("Black olives"),
    TOMATO("Tomato"),
    BROCCOLI("Broccoli"),
    GARLIC("Garlic"),
    CHILLI_PEPPERS("Chilli peppers"),
    NO_VEGETABLES("without Vegetables");
    private final String name;

    Veggies(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
