
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);

        // Swapping using a temporary variable
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping: n1 = " + n1 + ", n2 = " + n2);

        scanner.close();
    }
}
