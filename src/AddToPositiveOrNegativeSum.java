// 10.22 Bruce this program can execute 10 times and positive and negative sum.
import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pSum = 0;
        int nSum = 0;
        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number > 0) {
                pSum += number;
            }
            if (number <= 0) {
                nSum += number;
            }

        }
        //output the sum
        System.out.println(" ");
        System.out.println("The sum of the positive numbers is " + pSum);
        System.out.println("The sum of the negative numbers is " + nSum);
    }
}
