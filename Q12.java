import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        String[] eligibility = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            System.out.print("Mathematics: ");
            int math = sc.nextInt();

            System.out.print("Physics: ");
            int physics = sc.nextInt();

            System.out.print("Chemistry: ");
            int chemistry = sc.nextInt();

            if ((math >= 60 && physics >= 50 && chemistry >= 40 && (math + physics + chemistry >= 200)) ||
                    (math >= 60 && physics >= 50 && (math + physics >= 150))) {
                eligibility[i] = "Eligible";
            } else {
                eligibility[i] = "Not Eligible";
            }
        }

        System.out.println("\nEligibility Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + eligibility[i]);
        }

        sc.close();
    }
}
