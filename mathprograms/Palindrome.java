/** it will check whether the given number is palindrome or not */
public class Palindrome {

    public static void main(String args[]) {
        int number = 1234321;
        int rev = reversedNumber(number);
        if (number == rev) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        String name = "nagan";
        String reversedString = reversedString(name);
        if (name == reversedString) {
            System.out.println(name + " is a palindrome");
        } else {
            System.out.println(name + " is not a palindrome");
        }
    }

    private static int reversedNumber(int n) {
        int rem;
        int rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    private static String reversedString(String name) {
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }
        return reversedString;
    }
}
