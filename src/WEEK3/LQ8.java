package WEEK3;

import java.util.Scanner;

public class LQ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int n = in.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j < i) {
                    System.out.print("_ ");
                }
            }
            
            for(int k=i; k<=n; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
