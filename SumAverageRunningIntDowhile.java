public class SumAverageRunningIntDowhile {
    
    public static void main (String args[]){
        double average;
        int sum = 0;
        final int lowerbound = 1;
        final int upperbond = 100;
        int i = lowerbound;

        do {
            sum += i ;
            i++ ;
        }while (i <= upperbond);
            System.out.println("The sum of 1 to 100 is :" + sum);

            average =(double) sum / upperbond ;
            System.out.println("The average is : " + average);
    }
}
