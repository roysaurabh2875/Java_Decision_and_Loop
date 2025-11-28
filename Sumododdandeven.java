public class Sumododdandeven {
    public static void main (String args[]){
        int lowerbound = 1;
        int upperbond = 100 ;
        int sumodd = 0 ;
        int sumeven = 0;

        for (int i=lowerbound ; i <= upperbond ; i++){
            if( i % 2 == 0){
                sumeven += i ;
            }
        }
        System.out.println("sum of even num" + sumeven);

        for (int i=lowerbound ; i <= upperbond ; i++){
            if ( i % 2 != 0){
                sumodd += i ;
            }
        }
        System.out.println(sumodd);
        int differnce ;
        differnce = Math.abs(sumeven-sumodd);
        System.out.println("Differnce of numbers is :"+differnce);
    }
}
