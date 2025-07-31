import java.util.*;

public class Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater");
            System.out.println(a);
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("b is greater");
            System.out.println(b);
        }
        
        sc.close(); // It's a good practice to close the scanner
    }
}
