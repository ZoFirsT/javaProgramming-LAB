import java.util.Scanner;

public class lab2t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();


        int coin10 = num / 10;
        int coin5 = (num % 10) / 5;
        int coin1 = (num % 10) % 5;

        System.out.println("10: " + coin10);
        System.out.println("5: " + coin5);
        System.out.println("1: " + coin1);
    }
}
