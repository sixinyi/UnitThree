// Bruce 11/1 this can tall three sides if is right or not right.
import java.util.Scanner;

public class RightTriangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();



        if(isTriangle(side1, side2, side3) && isRight(side1, side2, side3))
            System.out.println("The side lengths " + side1 + ", " + side2 + ", and " + side3 + " form a right triangle");

        else if(isTriangle(side1, side2, side3) && !isRight(side1, side2, side3))
            System.out.println("The side lengths " + side1 + ", " + side2 + ", and " + side3 + " form a triangle, but it is not a right triangle");

        else
            System.out.println("The side lengths " + side1 + ", " + side2 + ", and " + side3 + " do not form a triangle");

    }

    private static boolean isRight(int a, int b, int c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    private static boolean isTriangle(int a, int b, int c){
        return a + b > c && b + c > a && a + c > b;
    }

}
