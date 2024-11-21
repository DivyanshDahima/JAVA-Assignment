public class Q23A {
    public static void main(String[] args) {
        int number = 1;
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
