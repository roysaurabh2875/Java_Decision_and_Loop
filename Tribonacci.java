
import java.util.*;

public class Tribonacci {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1 , b = 1, c = 2 ;
         for (int i = 1 ;i <= n ; i++){
            System.out.print(a + " ");
            int d = a + b + c ;
            a = b ;
            b = c ;
            c = d ;
         }
         sc.close();
    }
}
