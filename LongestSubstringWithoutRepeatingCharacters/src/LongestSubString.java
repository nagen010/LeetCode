import java.util.HashMap;

/** LongestSubStringWithoutRepeatingCharacter: Input a String
 *
 * return the length of longest sub-string without any repeating character.
 *
 * Created by nagen on 9/16/16.
 */
public class LongestSubString {

    private static int longestSubStringLength(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0, j = 0;
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(map.containsKey(c)) {
                j = Math.max(map.get(c), j);
            }
            ans = Math.max(ans, i - j + 1);
            map.put(c,i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestSubStringLength("abcdefghijabch"));
    }

}
