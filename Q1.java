import java.util.Scanner;

    public class Q1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            System.out.print("Enter the temperature: ");
            double temp = scanner.nextDouble();

            if (choice == 1) {
                System.out.printf("%.2f°C = %.2f°F%n", temp, (temp * 9 / 5) + 32);
            } else if (choice == 2) {
                System.out.printf("%.2f°F = %.2f°C%n", temp, (temp - 32) * 5 / 9);
            } else {
                System.out.println("Invalid choice.");
            }

            scanner.close();
        }
    }


