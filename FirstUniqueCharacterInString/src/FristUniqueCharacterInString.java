/**
 * FristUniqueCharacterInString: Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 * Created by nagen on 9/22/16.
 */
public class FristUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("abcdeffabce"));
        System.out.println(firstUniqueCharacter("aabbccddeeffgg"));
    }

    private static int firstUniqueCharacter(String s) {
        int[] integerCounts = new int[128];
        for(int i = 0; i < s.length(); i++) {
            integerCounts[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(integerCounts[s.charAt(i)]== 1) {
                return i;
            }
        }
        return -1;
    }
}
