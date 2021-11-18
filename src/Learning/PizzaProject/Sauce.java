package Learning.PizzaProject;

public enum Sauce {
    MARINARA("without the sauce"),
    NONE("Marinara sauce"),
    GARLIC("Garlic sauce"),
    BBQ("BBQ sauce"),
    CREAM("Sour Cream sauce");
    private final String name;

    Sauce(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}