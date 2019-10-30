import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle: ");
        int side1= input.nextInt();
        int side2= input.nextInt();
        int side3= input.nextInt();
        System.out.print(isRight(side1,side2,side3));
    }
}
