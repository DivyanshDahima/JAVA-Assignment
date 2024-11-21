import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number of the interval: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the interval: ");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Invalid interval! Starting number should be less than or equal to the ending number.");
        } else {
            System.out.println("Multiples of 10 between " + start + " and " + end + ":");

            boolean found = false;

            for (int i = start; i <= end; i++) {
                if (i % 10 == 0) {
                    System.out.print(i + " ");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No multiples of 10 found in the given interval.");
            }
        }

        sc.close();
    }
}
