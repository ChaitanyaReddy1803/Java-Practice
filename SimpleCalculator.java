public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        char operator = '+'; // Change to -, *, / for other operations
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
