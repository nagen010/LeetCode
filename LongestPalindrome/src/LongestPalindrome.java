import java.util.HashMap;
import java.util.Map;

/** LongestPalindrome
 * Created by nagen on 10/2/16.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    private static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int out = 0;
        boolean isOne = false;
        boolean isOdd = false;
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        for (Object o : map.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            int value = Integer.parseInt(pair.getValue().toString());
            if(value == 1) {
                isOne = true;
            } else if (value%2 == 0) {
                out += value;
            } else if (value%2 != 0) {
                isOdd = true;
                out += value -1 ;
            }
        }

        return isOne ? out+1 : (isOdd ? out+1 : out);
    }
}
