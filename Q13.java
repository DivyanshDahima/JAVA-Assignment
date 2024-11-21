import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range (l): ");
        int l = sc.nextInt();

        if (l <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int sum = l * (l + 1) / 2;

            System.out.println("The sum of natural numbers up to " + l + " is: " + sum);
        }

        sc.close();
    }
}
