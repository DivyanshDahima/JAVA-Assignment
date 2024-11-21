import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sumOfOdd = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                sumOfOdd += array[i];
            }
        }

        System.out.println("The sum of all odd numbers in the array is: " + sumOfOdd);

        sc.close();
    }
}
