
public class SumAverageRunningInt{
    public static void main (String args[]){
            double average ;
            int sum = 0 ;
             int lowerbound = 111 ;
             int upperbond = 8899;
            int count = 0 ;

            for ( int i = lowerbound; i <= upperbond ; i++ ){
                sum += i ;
                count++;
            }
            System.out.println("The sum of 1 to 100 is" + sum);
            System.out.println(count);

            average = (double) sum / upperbond ;
            System.out.println("Average is" + average);
    }
}