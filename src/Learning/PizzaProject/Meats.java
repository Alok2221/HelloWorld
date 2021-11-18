package Learning.PizzaProject;

public enum Meats {
    PEPPERONI("Pepperoni"),
    HAM("Ham"),
    PARMA_HAM("Parma ham"),
    BACON("Bacon"),
    SAUSAGE("Sausage"),
    CHICKEN("Chicken"),
    GYROS("Gyros"),
    BEEF("Beef"),
    WITHOUT_MEAT("Without meat");
    private final String name;

    Meats(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}