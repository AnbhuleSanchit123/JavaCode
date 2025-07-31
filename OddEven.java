import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: "); // Prompt for user input
        int a = sc.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        
        sc.close(); // Close the scanner to free up resources
    }
}
