package WEEK3;

import java.util.Scanner;

public class LQ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                if(i % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        
        in.close();
    }
}
