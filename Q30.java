import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int a = sc.nextInt();

        int[] array = new int[a];

        System.out.println("Enter the elements:");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < a; i += 2) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
