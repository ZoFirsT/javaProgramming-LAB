package WEEK3;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Task 1: Print out 3 popular styles
        /**************** YOUR CODE HERE (Task 1) *******************/
        System.out.println("=== Welcome to Customized Wallpaper System ===");
        System.out.println("We have 3 popular styles here:");
        System.out.println("=== Style 1 ===");
        
        int n = 5;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("=== Style 2 ===");
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col >= row) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("=== Style 3 ===");
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col <= row) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

        // Task 2: Get the size, style and symbol from users and print the output
        boolean stopProgram = false;
        int totalBill = 0;
        while (!stopProgram) {
            System.out.print("Please choose your style: ");
            int style = in.nextInt();
            
            if (style == -1) {
                System.out.println("Bye");
                break;
            }
            
            System.out.print("Size: ");
            int size = in.nextInt();
            System.out.print("Symbol: ");
            char symbol = in.next().charAt(0);

            if (style == 1) {
                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= row; col++) {
                        System.out.print(col + " ");
                    }
                    System.out.println();
                }
            } else if (style == 2) {
                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {
                        if (col >= row) {
                            System.out.print(symbol);
                        } else {
                            System.out.print(" ");
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            } else if (style == 3) {
                for(int row = 1; row <= size; row++) {
                    for(int col = 1; col <= size; col++) {
                        if(col <= row) {
                            System.out.print(col + " ");
                        } else {
                            System.out.print(symbol + " ");
                        }
                    }
                    System.out.println();
                }
            } else {
                stopProgram = true;
                System.out.println("Bye");
            }


            //task 3
            if (style == 1) {
                totalBill += 100;
            } else if (style == 2) {
                totalBill += 200;
            } else if (style == 3) {
                totalBill += 300;
            }
        }

        System.out.println("Total Bill: " + totalBill);
        in.close();
    }
}