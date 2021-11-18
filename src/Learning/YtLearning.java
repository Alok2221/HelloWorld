package Learning;

public class YtLearning {

    public static void main(String[] args) {

//        overloaded constructors = multiple constructors within a class with the same name,
//                                  but have different parameters
//                                  name + parameters = signature

//        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni", "", "", "");
        Pizza pizza1 = new Pizza();
        pizza1.setBread("thick crust");
        System.out.println(pizza1);

//        System.out.println("Here are the ingredients of your pizza: ");
//        System.out.println(pizza.getBread());
//        System.out.println(pizza.getSauce());
//        System.out.println(pizza.getCheese());
//        System.out.println(pizza.getTopping());
//        System.out.println(pizza.getTopping2());
//        System.out.println(pizza.getTopping3());
//
//        Pizza picka = new Pizza("thick crust");
//        System.out.println(picka.getBread());
//        System.out.println(picka.getSauce());
//        System.out.println(picka.getCheese());

        Bottom bottom = new Bottom();
        bottom.setCheesy("Cheesy");
        bottom.setCracker("Cracker");
        System.out.println(bottom);

    }
}