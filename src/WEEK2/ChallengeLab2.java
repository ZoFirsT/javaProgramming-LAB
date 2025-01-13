package WEEK2;

import java.util.Scanner;

public class ChallengeLab2 {
    public static void main(String[] args) {

        Scanner num12 = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String input1 = num12.nextLine();
        String[] numbers = input1.split(" ");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        // System.out.println(num1);
        // System.out.println(num2);
        
        int operation = input.nextInt();
        
        switch(operation) {
            case 1:
                System.out.printf("%.1f\n", (num1 + num2));
                break;
            case 2:
                System.out.printf("%.1f\n", (num1 - num2));
                break;
            case 3:
                System.out.printf("%.1f\n", (num1 * num2));
                break;
            case 4:
                System.out.printf("%.1f\n", (num1 / num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
        
        num12.close();
        input.close();
    }
}
