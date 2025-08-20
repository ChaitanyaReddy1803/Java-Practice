import java.util.Scanner;

public class LCMofTwoNumbers {
    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM is: " + lcm);

        scanner.close();
    }
}
