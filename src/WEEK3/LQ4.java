package WEEK3;

import java.util.Scanner;

public class LQ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();
        
        int count = 1;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.printf("%3d ", count);
                count++;
            }
            System.out.println();
        }
        
        in.close();
    }
}
