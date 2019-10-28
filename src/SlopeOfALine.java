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

        if(xa==xb) System.out.println("The line defined by the points ("+xa+", "+ya+") and ("+xb+", "+yb+") is a vertical line and the slope is undefined.");
        else System.out.println("The line defined by the points ("+xa+", "+ya+") and ("+xb+", "+yb+") has a slope of "+(double)(yb-ya)/(xb-xa));

    }

}
