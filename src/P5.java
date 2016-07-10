/**
 * Created by Gus on 2016-07-09.
 */
public class P5 {
    public static void main(String[] args) {
        int value = 1;
        boolean found = false;

        while (!found) {
            boolean noRemainder = true;
            int number = 1;

            while (noRemainder && number <= 20) {
                noRemainder = (value % number++ != 0) ? false : true;
            }

            if (noRemainder) {
                found = true;
            }else{
                value += 1;
            }
        }

        System.out.print("The smallest number that can be divided by each of the numbers from 1 to 20 is " + value);
    }
}
