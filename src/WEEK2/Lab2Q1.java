package WEEK2;
import java.util.Scanner;

public class Lab2Q1 {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        String input = weight.nextLine();
        String input2 = height.nextLine();
        String[] numbers = input.split(" ");
        String[] numbers2 = input2.split(" ");
        
        float num1 = Float.parseFloat(numbers[0]);
        float num2 = Float.parseFloat(numbers[1]); 
        float num3 = Float.parseFloat(numbers[2]);
        float num4 = Float.parseFloat(numbers[3]);

        float num5 = Float.parseFloat(numbers2[0]);
        float num6 = Float.parseFloat(numbers2[1]); 
        float num7 = Float.parseFloat(numbers2[2]);
        float num8 = Float.parseFloat(numbers2[3]);

        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(num3);
        // System.out.println(num4);

        // System.out.println(num5);
        // System.out.println(num6);
        // System.out.println(num7);
        // System.out.println(num8);

        weight.close();
        height.close();

        float averageWeight = (num1 + num2 + num3 + num4) /4;
        float averageHeight = (num5 + num6 + num7 + num8) /4;

        System.out.printf("The average weight is %.2f kg.\n", averageWeight);
        System.out.printf("The average height is %.2f cm.\n", averageHeight);

        
    }
}