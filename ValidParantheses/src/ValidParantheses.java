/** Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 *
 * Created by nagen on 9/26/16.
 */
public class ValidParantheses {

    public static void main(String[] args) {
        System.out.println(isValidParantheses("(){}[]()[]{}{}"));
    }

    private static boolean isValidParantheses(String s) {
        char[] stack = new char[s.length()];
        int curr = 0;
        for (char c: s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack[curr++] = c;
                    break;
                case '}':
                    if(curr == 0 || stack[--curr] != '{')
                        return false;
                    break;
                case ']':
                    if(curr == 0 || stack[--curr] != '[')
                        return false;
                    break;
                case ')':
                    if(curr == 0 || stack[--curr] != '(')
                        return false;
                    break;
            }
        }
        return curr == 0;
    }
}
