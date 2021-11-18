package Learning;

public class Pizza {
    private String bread;
    private String sauce;
    private String cheese;
    private String topping;
    private String topping2;
    private String topping3;
    private String topping4;

//    public Pizza(String bread, String sauce, String cheese, String topping, String topping2, String topping3, String topping4) {
//        this.bread = bread;
//        this.sauce = sauce;
//        this.cheese = cheese;
//        this.topping = topping;
//        this.topping2 = topping2;
//        this.topping3 = topping3;
//        this.topping4 = topping4;
//    }
//
//    public Pizza(String bread, String sauce, String cheese, String topping, String topping2, String topping3) {
//        this.bread = bread;
//        this.sauce = sauce;
//        this.cheese = cheese;
//        this.topping = topping;
//        this.topping2 = topping2;
//        this.topping3 = topping3;
//    }
//
//    public Pizza(String bread, String sauce, String cheese, String topping, String topping2) {
//        this.bread = bread;
//        this.sauce = sauce;
//        this.cheese = cheese;
//        this.topping = topping;
//        this.topping2 = topping2;
//    }
//
//    public Pizza(String bread, String sauce, String cheese, String topping) {
//        this.bread = bread;
//        this.sauce = sauce;
//        this.cheese = cheese;
//        this.topping = topping;
//    }
//
//    public Pizza(String bread, String sauce, String cheese) {
//        this.bread = bread;
//        this.sauce = sauce;
//        this.cheese = cheese;
//    }
//
//    public Pizza(String bread, String sauce) {
//        this.bread = bread;
//        this.sauce = sauce;
//    }
//
//    public Pizza(String bread) {
//        this.bread = bread;
//    }

    public String getBread() {
        return bread;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public String getTopping() {
        return topping;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Pizza" +
                "bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", topping='" + topping + '\'' +
                ", topping2='" + topping2 + '\'' +
                ", topping3='" + topping3 + '\'' +
                ", topping4='" + topping4 + '\'';
    }
}