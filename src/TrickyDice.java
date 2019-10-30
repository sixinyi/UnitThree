// Bruce 10.30 make a program that create two random number.
public class TrickyDice {

    private static void regularRoll(){
        int num = (int)(Math.random()*6)+1;
        System.out.println(num);
    }

    private static void trickyRoll(){
        double value = (int) (Math.random() * 100) + 1;
        if (value< 17)
            System.out.println("1");
        else if (value< 34)
            System.out.println("2");
        else if (value< 51)
            System.out.println("3");
        else if (value< 68)
            System.out.println("4");
        else if (value< 85)
            System.out.println("5");
        else if (value>= 85)
            System.out.println("6");
    }

    public static void main(String[] args) {
        regularRoll();
        trickyRoll();
    }

}
