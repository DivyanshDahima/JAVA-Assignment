import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binary = sc.next();
                int decimal = binaryToDecimal(binary);
                System.out.println("The decimal equivalent of binary " + binary + " is: " + decimal);
                break;

            case 2:
                System.out.print("Enter a decimal number: ");
                int decimalNumber = sc.nextInt();
                String binaryString = decimalToBinary(decimalNumber);
                System.out.println("The binary equivalent of decimal " + decimalNumber + " is: " + binaryString);
                break;

            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
        }

        sc.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binary.length() > 0 ? binary.toString() : "0";
    }
}
