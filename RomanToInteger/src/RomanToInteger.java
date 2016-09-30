/** RomanToInteger: Given a roman numeral, convert it to an integer.
 *
 * Created by nagen on 9/29/16.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInteger("XXV"));
    }

    private static int romanToInteger(String s) {
        int output = 0;
        char previous = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I':
                    output++;
                    break;
                case 'V':
                    output += (previous == 'I') ? 3 : 5;
                    break;
                case 'X':
                    output += (previous == 'I') ? 8 : 10;
                    break;
                case 'L':
                    output += (previous == 'X') ? 30 : 50;
                    break;
                case 'C':
                    output += (previous == 'X') ? 80 : 100;
                    break;
                case 'D':
                    output += (previous == 'C') ? 300 : 500;
                    break;
                case 'M':
                    output += (previous == 'C') ? 800 : 1000;
                    break;
                default:
                    return 0;
            }
            previous = c;
        }
        return output;
    }
}
