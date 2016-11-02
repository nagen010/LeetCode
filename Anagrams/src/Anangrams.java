import java.util.ArrayList;
import java.util.List;

/** Given a string s and a non-empty string p,
 * find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and
 * the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 *
 * Created by nagen on 11/1/16.
 */
public class Anangrams {
    public static void main(String[] args) {
        findAnagrams("cbaebabacd", "abc").forEach(System.out::println);
        findAnagrams("aaaaabaaaba", "aaaa").forEach(System.out::println);

    }

    private static List<Integer> findAnagrams(String input, String ana) {
        List<Integer> output = new ArrayList<>();
        int characters[] = new int[26];
        for (char c: ana.toCharArray()) {
            characters[c - 'a']++;
        }

        int begin = 0, end  = 0, len = ana.length();
        while (end < input.length()) {
            if(characters[input.charAt(end)-'a'] >= 1) {
                len--;
            }
            characters[input.charAt(end)-'a']--;
            end++;

            if(len == 0) output.add(begin);

            if(end - begin == ana.length()) {
                if (characters[input.charAt(begin)-'a'] >= 0)
                    len++;
                characters[input.charAt(begin)-'a']++;
                begin++;
            }
        }
        return output;
    }
}
