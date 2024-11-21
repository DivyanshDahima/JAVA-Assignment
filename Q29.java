import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
        }

        System.out.println("Duplicate elements and their frequencies:");
        boolean foundDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
