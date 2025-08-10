import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        // Handle zero separately
        if (number == 0) {
            count = 1;
        } else {
            // For negative numbers, make them positive
            number = Math.abs(number);
            
            while (number != 0) {
                count++;
                number /= 10;
            }
        }

        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}
