import java.util.*;

public class ComputePI {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the max denominator");
        int max_denominator = sc.nextInt();
        double sum = 0.0 ;
        double pi ;

        for (int i = 1 ;i <= max_denominator ;i += 2){
            if(i % 4 == 1){
                sum += 1.0/i ;
            }
            else if(i % 4 == 3){
                sum -= 1.0/i ;
            }
             else {   // remainder of 0 or 2 
            System.out.println("Impossible!!!"); 
         }
        }
        pi= 4 * sum ;

        System.out.println(pi);
    }
}
