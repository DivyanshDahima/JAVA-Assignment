import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int digitCount = 0;
        if (number == 0) {
            digitCount = 1;
        } else {
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
        }

        System.out.println("The number of digits is: " + digitCount);

        sc.close();
    }
}
