import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Swapping using a temporary variable
        System.out.println("\nSwapping using temporary variable:");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Reset original values for second method
        System.out.print("\nRe-enter values for a: ");
        a = scanner.nextInt();
        System.out.print("Re-enter values for b: ");
        b = scanner.nextInt();

        // Swapping without using a temporary variable
        System.out.println("\nSwapping without using temporary variable:");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);

        scanner.close();
    }
}
