import java.util.Scanner;

public class ShareDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first int: ");
        int first = input.nextInt();
        System.out.println("Enter second int: ");
        int second = input.nextInt();

        System.out.println(ShareDigits(first,second));
    }

    private static boolean ShareDigits(int a, int b) {
        int a10 = a / 10;
        int a1 = a % 10;
        int b10 = b / 10;
        int b1 = b % 10;
        if (a10 == b10) {
            return true;
        } else if (a10 == b1) {
            return true;
        } else if (a1 == b10) {
            return true;
        } else if (a1 == b1) {
            return true;
        } else {
            return false;
        }
    }
}