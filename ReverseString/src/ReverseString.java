/** Write a function that takes a string as input and returns the string reversed.
 * Created by nagen on 10/6/16.
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("hello"));
        System.out.println(rs.reverseString("leetcode"));
    }

    private String reverseString(String s) {
        char[] tempString = s.toCharArray();
        for (int i = 0; i < tempString.length/2; ++i) {
            char temp = tempString[i];
            tempString[i] = tempString[tempString.length-1-i];
            tempString[tempString.length-1-i] = temp;
        }
        return new String(tempString);
    }
}
