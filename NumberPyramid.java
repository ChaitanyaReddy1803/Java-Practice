import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
