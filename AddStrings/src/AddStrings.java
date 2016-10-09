/** Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
 * Created by nagen on 10/9/16.
 */
public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("12345","12345"));
        System.out.println(addStrings("123456","123456"));
    }

    private static String addStrings(String n1, String n2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = n1.length()-1, j = n2.length()-1; i >= 0 || j >= 0; --i, --j) {
            int x = i < 0 ? 0 : n1.charAt(i) - '0';
            int y = j < 0 ? 0 : n1.charAt(j) - '0';
            sb.append((x+y+carry)%10);
            carry = (x+y+carry)/10;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
