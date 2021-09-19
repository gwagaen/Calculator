import java.util.regex.*;
import java.util.Scanner;
import java.lang.*;
public class cal {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner inputstr = new Scanner(System.in);
        System.out.print("Input: ");
        String actualString = inputstr.nextLine();
        actualString = actualString.replaceAll("\\s+", "");

        if (actualString.contains("+")) {
            Pattern pattern = Pattern.compile("\\+");
            String[] array = pattern.split(actualString, 0);
            float res = Integer.valueOf(array[0]) + Integer.valueOf(array[1]);
            System.out.println(res);
        }
        if (actualString.contains("-")) {
            Pattern pattern = Pattern.compile("\\-");
            String[] array = pattern.split(actualString, 0);
            float res = Integer.valueOf(array[0]) - Integer.valueOf(array[1]);
            System.out.println(res);
        }
        if (actualString.contains("*")) {
            Pattern pattern = Pattern.compile("\\*");
            String[] array = pattern.split(actualString, 0);
            float res = Integer.valueOf(array[0]) * Integer.valueOf(array[1]);
            System.out.println(res);
        }
        if (actualString.contains("/")) {
            Pattern pattern = Pattern.compile("\\/");
            String[] array = pattern.split(actualString, 0);
            float res = Integer.valueOf(array[0]) / Integer.valueOf(array[1]);
            System.out.println(res);
        }
        else {
            System.out.println("Please, try again!");
        }
    }
}
