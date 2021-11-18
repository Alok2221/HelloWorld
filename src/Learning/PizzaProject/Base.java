package Learning.PizzaProject;

public enum Base {

    STUFFED_CRUST("Stuffed Crust"),
    CRACKER_CRUST("Cracker Crust"),
    FLAT_BREAD_CRUST("Flat Bread Crust"),
    THIN_CRUST("Thin Crust"),
    CHEESE_CRUST_PIZZA("Cheese Crust Pizza"),
    WRAPPING_IT_UP("Wrapping It Up");

    private final String name;

    Base(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}