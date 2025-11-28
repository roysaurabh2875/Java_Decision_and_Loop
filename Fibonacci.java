
public class Fibonacci {
    public static void main(String args[]) {

        int n = 3;
        int fn ;
        int fnminus1 = 1 ;
        int fnminus2 = 1 ;
        int  nmax = 20 ;
        double average ;
        int sum = 0 ;

        System.out.println("the first " + nmax + "Fibonacci numbers are :");
        System.out.print(fnminus1 + " "+fnminus2 + " ");

        while ( n <= nmax){
            fn = fnminus1 + fnminus2 ;
            System.out.print(fn + " ");

            sum += fn ;
            n++;
            fnminus2 = fnminus1 ;
            fnminus1 = fn ;
        }
        System.out.println();
        average = (double)sum/nmax ;
        System.out.println("The average is :"+average);
    }
}
