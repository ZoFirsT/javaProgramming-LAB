package WEEK3;
import java.util.Scanner;


public class Lacture {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        System.out.println("สูตรคูณแม่ " + number);
        System.out.println("-----------------");
        
        for(int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        in.close();
    }
}
