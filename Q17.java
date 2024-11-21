import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int hcf = findHCF(n1, n2);
        int lcm = (n1 * n2) / hcf;

        System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + lcm);

        sc.close();
    }

    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
