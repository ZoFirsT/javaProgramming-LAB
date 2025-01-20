package WEEK3;

import java.util.Scanner;

public class LQ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
