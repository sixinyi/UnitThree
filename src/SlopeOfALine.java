// 10/28 Bruce a program that will allow the user to enter four int values, x1, y1, x2, and y2, that represent two points on a line.

import java.util.Scanner;

public class SlopeOfALine {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter x1: ");
        int xa=input.nextInt();
        System.out.print("Enter y1: ");
        int ya=input.nextInt();
        System.out.print("Enter x2: ");
        int xb=input.nextInt();
        System.out.print("Enter y2: ");
        int yb=input.nextInt();

        System.out.println(slope(xa, ya, xb, yb));

    }

    private static String slope(int x1, int y1, int x2, int y2){

        if (x1 == x2) {
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is " + "a vertical line and the slope is undefined.";
        }

        else {
            double slope = (double)(y2-y1)/(x2-x1);
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is " + "has a slope of "+slope;
        }
    }
}
