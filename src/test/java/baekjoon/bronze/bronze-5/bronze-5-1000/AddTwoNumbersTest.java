import java.util.Scanner;

public class AddTwoNumbersTest {
    public static void main(String[] args) {
        /*  경고 무시
            @SuppressWarnings("resource")
         */

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A+B);

        /* java.lang.IllegalStateException: Scanner closed 발생 : 
           입력을 모두 마친 후, scan.close() 작성
        */

        scanner.close();
    }
}