import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name: ");
        String nm=input.nextLine();
        int space= nm.indexOf(" ");

        String fn= nm.substring(0,space);
        String ln= nm.substring(space+1);

    }
}