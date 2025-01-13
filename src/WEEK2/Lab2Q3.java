package WEEK2;
import java.util.Scanner;

public class Lab2Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();

        if (input >= 0) {
            if (input >= 1000) {
                System.out.println(input * 0.8);
            } else if (input >= 100) {
                System.out.println(input * 0.9);
            } else if (input >= 50) {
                System.out.println(input * 0.95);
            } else {
                System.out.println(input);
            }
        }

        scanner.close();
    }
}
