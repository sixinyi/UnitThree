// Bruce 11/1 Email Thank you for let us to do it again!!
import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String first = input.nextLine();
        System.out.println("Enter your Last name: ");
        String last = input.nextLine();

        String part1 = EmailGenerator.makeUserName(first,last);
        String part2 = EmailGenerator.makeEmail();

        System.out.print("This user’s e-mail is: ");
        System.out.print(part1+part2);
    }
    private static String makeUserName(String first,String last){
        String UserName = (first.substring(0,1)).toLowerCase()+last.toLowerCase();
        return UserName;
    }
    private static String makeEmail(){
        String email = "@ssfs.org";
        return email ;
    }
}