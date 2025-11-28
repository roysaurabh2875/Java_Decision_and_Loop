public class HarmonicSum {

    public static void main(String args[]) {
        int max_denominator = 50000;
        double suml2r = 0.0;
        double sumr2l = 0.0;

        for (int i = 1; i <= max_denominator; i++) {
            suml2r += 1.0 / i;
        }
        for (int i = max_denominator; i >= 1; i--) {
            sumr2l += 1.0 / i;
        }
        double differnce = Math.abs(suml2r - sumr2l);

        System.out.println("sum from left to right is :" + suml2r);
        System.out.println("Sum from right to left is :" + sumr2l);
         System.out.printf("Absolute difference: %.15f%n", differnce);

        if (suml2r == sumr2l) {
            System.out.println("both the sums are equal");
        } else {
            System.out.println("the sums are not same");
        }
        if(suml2r > sumr2l){
            System.out.println("Sum is more accurate from left to right");
        }else {
            System.out.println("Sum is more accurate from right to left");
        }
    }
}
