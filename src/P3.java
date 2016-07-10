/**
 * Created by Gus on 2016-07-09.
 */
public class P3 {
    public static void main(String[] args) {
        long value = 600851475143L;

        System.out.print("The largest prime factor of " + value + " is " + P3.largestPrimeFactor(value));
    }

    public static int largestPrimeFactor(long number) {
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}
