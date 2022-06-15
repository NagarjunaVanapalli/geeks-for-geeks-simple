/**
 * This program is to count the number digits.
 */
public class CountingDigits {

    public static void main(String[] args) {
        // int noofdigits = getDigitsCountIterative(124354335);
        // int noofdigits = getDigitsCountRecurssive(124354335);
        int noofdigits = getDigitsCountLog(124354335);
        System.out.println(noofdigits);
    }

    private static int getDigitsCountIterative(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    private static int getDigitsCountRecurssive(int n) {

        if(n == 0)
        {
            return 0;
        }
        return 1+getDigitsCountRecurssive(n/10);
    }

    private static int getDigitsCountLog(int n) {
        return (int) Math.floor(1+ Math.log10(n));
    }

    
}
