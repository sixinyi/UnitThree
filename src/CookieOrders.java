// Bruce 10.30 this program is to tell us how are the cookies price.
import java.util.Scanner;

public class CookieOrders {
    public static void main(String[] args){
        System.out.println(
                "1-4 boxes:         6.95 per box\n" +
                "5-9 boxes:         5.95 per box\n" +
                "10-15 boxes:       5.50 per box\n" +
                "16 or more boxes:  4.95 per box\n" +
                "Enter the number of boxes you wish to purchase: ");
        Scanner input= new Scanner(System.in);
        int boxs= input.nextInt();
        System.out.print(totalCost(boxs));
    }
    private static String totalCost(int boxs){
        if (boxs >= 0 && boxs <= 4) {
            double totalBill = 6.95 * boxs;
            return "You bought "+boxs+" boxes of cookies at $6.95 per box. Your total bill is $"+totalBill;
        }
        else if (boxs >= 5 && boxs <= 9) {
            double totalBill = 5.95 * boxs;
            return "You bought "+boxs+" boxes of cookies at $5.95 per box. Your total bill is $"+totalBill;
        }
        else if (boxs >= 10 && boxs <= 15) {
            double totalBill = 5.50 * boxs;
            return "You bought "+boxs+" boxes of cookies at $5.50 per box. Your total bill is $"+totalBill;
        }
        else if (boxs >= 16) {
            double totalBill = 4.95 * boxs;
            return "You bought "+boxs+" boxes of cookies at $4.95 per box. Your total bill is $"+totalBill;
        }
        else {
            return "Your input is invalid";
        }
    }
}
