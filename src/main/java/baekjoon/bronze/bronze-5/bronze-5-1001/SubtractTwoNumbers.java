import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        
        System.out.println(A-B);
        
        scanner.close();
    }
}