
import java.util.*;

public class ExtractDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n :");
        int n = sc.nextInt();
        int remainder;

        while (n > 0) {
            remainder = n % 10;
            System.out.print(remainder + " ");
            n = n / 10;
        }
    }
}
