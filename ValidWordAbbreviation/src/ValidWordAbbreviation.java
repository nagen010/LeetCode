import java.util.*;

/** validWordAbbreviation
 * Created by nagen on 10/1/16.
 */
public class ValidWordAbbreviation {
    private static boolean validWordAbbreviation(String word, String abbr) {

        if (word.length() < abbr.length()) {
            return false;
        }
        int abb_length = 0;
        boolean isNumber = false;
        for (int i = 0; i < abbr.length(); i++) {
            char c = abbr.charAt(i);

            if(!Character.isDigit(c)) {
                abb_length ++;
            } else {
                isNumber = true;
            }
        }
        if (isNumber) {
            String abbr_number = abbr;
            abbr_number = abbr_number.replaceAll("[^0-9]+", " ");
            List<String> ListNumber = new ArrayList<>(Arrays.asList(abbr_number.trim().split(" ")));
            for (String s : ListNumber) {
                abb_length += Integer.parseInt(s);
            }
        }
        return abb_length == word.length();
    }

    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("a","01"));
    }
}
