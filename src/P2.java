/**
 * Created by Gus on 2016-07-09.
 */
public class P2 {
    public static void main(String[] args) {
        int sum = 0;
        int num1 = 1;
        int num2 = 1;


        for (int fibonacci = 0; fibonacci < 4000000; fibonacci = num1 + num2) {
            if (fibonacci % 2 == 0) {
                sum += fibonacci;
            }

            num1 = num2;
            num2 = fibonacci;

        }

        System.out.print(sum);
    }
}
