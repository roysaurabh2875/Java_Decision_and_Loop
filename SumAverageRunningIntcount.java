
public class SumAverageRunningIntcount {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 111; i <= 8899; i++) {
            sum += i;
            count++; // increment count for each number
        }

        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
    }
}