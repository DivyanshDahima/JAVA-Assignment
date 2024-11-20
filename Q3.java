import java.util.Scanner;
    public class Q3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int n2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int n3 = scanner.nextInt();

            int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

            System.out.println("The maximum of the three numbers is: " + max);

            scanner.close();
        }
    }


