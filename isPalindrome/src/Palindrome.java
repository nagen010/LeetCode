/** Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.
 * Created by nagen on 11/15/16.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("b   aeab"));
    }

    private static boolean isPalindrome(String str) {
        int start = 0, last = str.length()-1;
        while(start < last) {
            while(start < last && !Character.isLetterOrDigit(str.charAt(start))) start++;
            while(start < last && !Character.isLetterOrDigit(str.charAt(last))) last--;
            if(Character.toLowerCase(str.charAt(start))!= Character.toLowerCase(str.charAt(last))) {
                return false;
            }
            start++; last--;
        }
        return true;
    }
}
