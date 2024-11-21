import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to generate its multiplication table: ");
        int number = sc.nextInt();

        System.out.print("Enter the range for the multiplication table: ");
        int range = sc.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
