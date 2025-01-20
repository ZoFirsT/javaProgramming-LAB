package WEEK3;

import java.util.Scanner;

public class LQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        
        int gcd = 1;
        int min = Math.min(a, b);
        
        for(int i = 1; i <= min; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        
        System.out.println("GCD " + a + "," + b + " is: " + gcd);
        in.close();
    }
}
