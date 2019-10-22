// 10.22 Bruce   FindLargest
import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum=input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum=input.nextInt();

        if(firstNum>secondNum)
            System.out.println(firstNum+"is larger than"+secondNum);
        if(firstNum==secondNum)
            System.out.println(firstNum+" and "+secondNum+" are equal.");
        if(firstNum<secondNum)
            System.out.println(secondNum+" is larger than "+firstNum);
    }
}
