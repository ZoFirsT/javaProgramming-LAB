package WEEK2;
import java.util.Scanner;

public class Lab2Q2 {
    public static void main(String[] args) {
        // int amount = 28;
        Scanner amount = new Scanner(System.in);
        int input = amount.nextInt();
        
        int coin10 = input / 10;
        int remaining = input % 10;
        
        int coin5 = remaining / 5;
        remaining = remaining % 5;
        
        int coin1 = remaining;
        
        System.out.println("10: " + coin10);
        System.out.println("5: " + coin5); 
        System.out.println("1: " + coin1);

        amount.close();
    }
}
