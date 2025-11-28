public class CozaLozaWoza {
    public static void main(String args[]) {
        int lowerbond = 1;
        int upperbond = 110;
        int count = 0 ;

        for (int i = lowerbond; i <= upperbond; i++) {
            if (i % 3 == 0) {
                System.out.print("Coza");
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
            }
            
            if ((i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
                System.out.print(i);
            }
            count++ ;
            if (count % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" | ");  
            }
        }
    }
}
