package Learning;

public class YtLearning {

    public static void main(String[] args) {

        // overloaded methods = methods that share same name but have different parameters
        //                      method name + parameter = method signature

        double x = add(1.0, 4.0, 7.0, 10.0);
        System.out.println(x);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded methode #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded methode #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded methode #3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("This is overloaded methode #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded methode #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded methode #6");
        return a + b + c + d;
    }
}