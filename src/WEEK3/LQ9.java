package WEEK3;

import java.util.Scanner;

public class LQ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("table position=\"" + i + "," + j + "\" ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
