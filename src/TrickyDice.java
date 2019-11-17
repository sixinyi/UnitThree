// Bruce 10.30 make a program that create two random number.
public class TrickyDice {

    private static int regularRoll(){
        int num = (int)(Math.random()*6)+1;
        //System.out.println(num);
        return num;
    }

    private static int trickyRoll(){
        double value =  (Math.random() * 100) + 1;
        if (value< 17) {
            return 1;
        }
        else if (value< 34){
            return 2;
        }
        else if (value< 51){
            return 3;
        }
        else if (value< 68){
            return 4;
        }
        else if (value< 81.66) {
            return 5;
        }
        else  {
            return 6;
        }
    }

    public static void main(String[] args) {
        int res;

        res = regularRoll();
        System.out.println("regular rolling result: " + res);
        res = trickyRoll();
        System.out.println("Tricky rolling result: " + res);
    }

}
