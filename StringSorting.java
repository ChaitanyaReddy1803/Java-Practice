// StringSorting.java
import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Convert to char array
        char[] chars = input.toCharArray();
        
        // Sort using Arrays.sort
        Arrays.sort(chars);
        
        // Convert back to string
        String sorted = new String(chars);
        
        System.out.println("Sorted string: " + sorted);
        
        sc.close();
    }
}
