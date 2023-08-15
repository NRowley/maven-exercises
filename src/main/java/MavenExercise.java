import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
//    Tells whether or not what the user entered is a number
//    Flips the case of the string
//    Reverses the string

    public static boolean isNum(String something){
        return StringUtils.isNumeric(something);
    }

    public static String flipCase(String something){
        return StringUtils.swapCase(something);
    }

    public static String reverse(String something){
        return StringUtils.reverse(something);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something!");
        String something = scan.nextLine();
        System.out.println("Is numeric: " + isNum(something));
        System.out.println("Flippin: "+ flipCase(something));
        System.out.println("Reversin: "+ reverse(something));
    }
}
