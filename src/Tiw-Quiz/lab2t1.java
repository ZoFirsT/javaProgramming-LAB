import java.util.Scanner;

public class lab2t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read two lines of input
        String input = in.nextLine();
        String input2 = in.nextLine();

        // Split the strings into parts
        String[] data = input.split(" ");
        String[] data2 = input2.split(" ");

        in.close();

        float num11 = Float.parseFloat(data[0]);
        float num12 = Float.parseFloat(data[1]);
        float num13 = Float.parseFloat(data[2]);
        float num14 = Float.parseFloat(data[3]);

        float num21 = Float.parseFloat(data2[0]);
        float num22 = Float.parseFloat(data2[1]);
        float num23 = Float.parseFloat(data2[2]);
        float num24 = Float.parseFloat(data2[3]);

        float avgw = (num11 + num12 + num13 + num14) / 4;
        float avgh = (num21 + num22 + num23 + num24) / 4;

        System.out.printf("The average weight is %.2f kg.\n", avgw);
        System.out.printf("The average height is %.2f cm.\n", avgh);
    }
}

