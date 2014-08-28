package interview.prepwork;

/**
 * Created by scootdog on 8/27/14.
 */
public class Algorithms {

    public static int multiples3and5(int maxValue) {
        int sum = 0;

        for (int i = 0; i < maxValue; i++) {
            if(i%3 == 0 && i%5 ==0) {
                sum = sum+i;
            }
        }

        return sum;
    }

    public static void main(String args[]) {
        int multiplesLimit = 1000;
        System.out.println(String.format("The sum of multiples of 3 and 5 under %d is %d",
                multiplesLimit,
                multiples3and5(multiplesLimit)));
    }
}
