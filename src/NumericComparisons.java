//10/21 Bruce we use this to learn what is what
import java.util.Scanner;

public class NumericComparisons {

// for Private
    private static boolean isZero(int a){
        return a==0;
    }
    private static boolean isPositive(int a){
        return a>0;
    }
    private static boolean isNegative(int a){
        return a<0;
    }
    private static boolean isNonNegative(int a){
        return a>=0;
    }
    private static boolean isNonPositive(int a){
        return a<=0;
    }
    private static boolean isOdd(int a){
        return a/2!=0;
    }
    private static boolean isMultiple(int a,int b){
        return a/b==0;
    }
    private static boolean isFactor(int a,int b){
        return b/a==0;
    }

    // for print out
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number one: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number two: ");
        int num2 = scan.nextInt();
        System.out.println(num1 + " is odd: " + isOdd(num1));
        System.out.println(num1 + " is positive: " + isPositive(num1));
        System.out.println(num1 + " is negative: " + isNegative(num1));
        System.out.println(num1 + " is non negative: " + isNonNegative(num1));
        System.out.println(num1 + " is zero: " + isZero(num1));
        System.out.println(num1 + " is non positive: " + isNonPositive(num1));
        System.out.println(num1 + " is a multiple for num2: " + isMultiple(num1,num2));
        System.out.println(num1 + " is a factor for num2: " + isFactor(num1,num2));
}