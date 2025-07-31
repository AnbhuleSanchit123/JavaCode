import java.util.*;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: "); // Prompt for user input
        int marks = sc.nextInt();
        
        // Check if marks are within a valid range (0-100)
        if (marks < 0 || marks > 100) {
            System.out.println("Please enter valid marks between 0 and 100.");
        } else {
            String reportcard = marks >= 28 ? "Pass" : "Fail";
            System.out.println(reportcard);
        }
        
        sc.close(); // Close the scanner to free up resources
    }
}
