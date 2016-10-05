/** The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 * Created by nagen on 10/4/16.
 */
public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay cs = new CountAndSay();
        System.out.println(cs.countAndSay(599));
    }

    private String countAndSay(int n) {
        String s = "1";
        for(int i = 0; i < n; i++) {
            s = findSequence(s);
        }
        return s;
    }

    private String findSequence(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
