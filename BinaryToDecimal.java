import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal value: " + decimal);

        scanner.close();
    }
}
