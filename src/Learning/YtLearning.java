package Learning;

public class YtLearning {

    public static void main(String[] args) {
        // printf() =   an optional method to control, format, and display text to the console window
        //              two arguments = format string + (object/variable/value)
        //              % [flags][precision][width][conversion-character]

        boolean myBoolean = true;       // %b for boolean
        char myChar = '@';              // %c for char
        String myString = "Aleks";      // %s for String
        int myInt = 50;                 // %d for int
        double myDouble = 1000.99;      // %f for double, float

        System.out.printf("%b ", myBoolean);
        System.out.println("");
        System.out.printf("%c ", myChar);
        System.out.println("");
        System.out.printf("%s ", myString);
        System.out.println("");
        System.out.printf("%d ", myInt);
        System.out.println("");
        System.out.printf("%f ", myDouble);
        System.out.println("");

        //[width] = minimum number of characters to be witten as output

        System.out.printf("Hello%7s", myString);
        System.out.println("");

        //[precision] = sets number of digits of precision when outputting floating-point values

//      System.out.printf("You have this much money %.2f ", myDouble);
        System.out.println("");

        // [flags] = adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separators if number > 1000

        System.out.printf("You have this much money %.2f", myDouble);

    }
}