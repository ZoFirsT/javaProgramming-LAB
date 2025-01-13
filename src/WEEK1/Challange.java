package WEEK1;
import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        // System.out.println(bmi);
        
        System.out.printf("Your BMI is %.2f\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("Overweight"); 
        } else if (bmi >= 30) {
            System.out.println("Obesity");
        }
        
        scanner.close();
    }
}
