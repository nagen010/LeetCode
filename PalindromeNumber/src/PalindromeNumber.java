/**
 * PalindromeNumber: input the number
 *
 * return true if the number is a palindrome
 *
 * Created by nagen on 9/18/16.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(19822891));
    }

    private static boolean isPalindrome(int i) {
        return i >= 0 && i == reverseNumber(i);

    }

    private static int reverseNumber(int i) {
        int ans = 0;
        while (i != 0) {
            ans = ans * 10 + (i%10);
            i /= 10;
        }
        return ans;
    }
}
