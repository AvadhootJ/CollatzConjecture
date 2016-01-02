import java.util.Scanner;

/**
 * Created by Avadhoot Joshi.
 * The Collatz Conjecture is an interesting mathematical problem.
 * This program helps us to visualize how a number reaches 1 using Collatz Conjecture.
 * Basic rules to know, if number is even, n/2, if odd, 3n+1.
 * Please do not enter zero.
 */
public class CCVisualizer {

    public static void main(String[] args) {
        int counter = 0; // Counts number of calculations
        String calculations = ""; // Displays the number's path to 1.
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = s.nextInt();
        if (number == 1) {
            calculations += number + " " + "--->" + " ";
        }
        while (number != 1) {
            counter++;
            number = number % 2 == 0 ? number / 2 : (3* number) + 1;
            calculations += number + " " + "--->" + " ";
        }
        System.out.println(calculations.substring(0, calculations.length() - 5));
        System.out.println("It took " + counter + " calculation(s) to reach the number 1 ");
    }
}
