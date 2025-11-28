
public class Product1ToN  {
    public static void main (String args[]){

        int upperbond= 10 ;
        int lowerbond =  1 ;
        long product = 1 ;

        for ( int i = lowerbond ;i <= upperbond ; i++){
            product *= i ;
        }
        System.out.println("Product from 1 to 10 is :"+product);
    }
}
