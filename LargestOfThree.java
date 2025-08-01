public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;
        int num3 = 62;

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Third Number: " + num3);
        System.out.println("The largest number is: " + largest);
    }
}
