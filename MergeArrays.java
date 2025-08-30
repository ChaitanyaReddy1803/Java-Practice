import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
