
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        //double first = Double.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        //double second = Double.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());


        System.out.println( first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + Double.valueOf(first)/Double.valueOf(second));



    }
}
