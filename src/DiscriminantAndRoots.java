// Bruce 10/30 program about roots
import java.util.Scanner;

public class DiscriminantAndRoots {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=input.nextInt();
        System.out.println("Enter b: ");
        int b=input.nextInt();
        System.out.println("Enter c: ");
        int c=input.nextInt();

        System.out.println(roots(a, b, c));

    }

    public static String roots(int a, int b, int c){
        double value= b*b-(4*a*c);
        System.out.print(a+"x^2 +"+b+"x +"+c+" has ");
        if (value<0)
            return "2 imaginary roots";
        else if (value>0)
            return "2 real roots";
        else if (value==0)
            return "1 real root";

        else return " ";

    }

}
