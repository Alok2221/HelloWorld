package Learning;

public class YtLearning {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a list of values
        // switch works with ( byte, short, char, int) it also works witch enumerated types ( the String class, and few classes that wrap certain primitive types: Character, Byte, Short, and Integer

        String day = "pizza";

        switch (day){
            case "Monday":  System.out.println("It is Monday!");
                break;
            case "Tuesday":  System.out.println("It is Tuesday!");
                break;
            case "Wednesday":  System.out.println("It is Wednesday!");
                break;
            case "Thursday":  System.out.println("It is Thursday!");
                break;
            case "Friday":  System.out.println("It is Friday!");
                break;
            case "Saturday":  System.out.println("It is Saturday!");
                break;
            case "Sunday":  System.out.println("It is Sunday!");
                break;
            default: System.out.println("That is not a day!!!");
        }


    }

}


