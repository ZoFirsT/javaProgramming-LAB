package WEEK3;
import java.util.Scanner;

public class LQ3 {
    public static void main(String[] args) {
        int sinovacQuota = 2;
        int modernaQuota = 1;
        Scanner in = new Scanner(System.in);
        String choice;
        
        do {
            System.out.println("\n=== Welcome to COVID-19 Vaccine Registration System ===");
            System.out.println("Please choose your vaccine:");
            System.out.println("[S]inovac");
            System.out.println("[M]oderna");
            
            choice = in.nextLine().toLowerCase();
            
            switch(choice) {
                case "s":
                    if(sinovacQuota > 0) {
                        System.out.print("Name: ");
                        String name = in.nextLine();
                        System.out.print("Telephone No: ");
                        String phone = in.nextLine();
                        
                        System.out.println("Congratulations! " + name + ". We have booked you with Sinovac. Once we have the date, we will call you at " + phone + ".");
                        
                        sinovacQuota--;
                    } else {
                        System.out.println("Sorry! We ran out Sinovac. :(");
                    }
                    break;
                    
                case "m":
                    if(modernaQuota > 0) {
                        System.out.print("Name: ");
                        String name = in.nextLine();
                        System.out.print("Telephone No: ");
                        String phone = in.nextLine();
                        
                        System.out.println("Congratulations! " + name + ". We have booked you with Moderna. Once we have the date, we will call you at " + phone + ".");
                        
                        modernaQuota--;
                    } else {
                        System.out.println("Sorry! We ran out Moderna. :(");
                    }
                    break;
                    
                case "x":
                    System.out.println("--- Good Bye ---");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        } while(!choice.equals("x"));
        
        in.close();
    }
}
