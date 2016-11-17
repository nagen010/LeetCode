import java.util.Arrays;

/** Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie.
 * Each child i has a greed factor gi, which is the
 * minimum size of a cookie that the child will be content with;
 * and each cookie j has a size sj. If sj >= gi,
 * we can assign the cookie j to the child i,
 * and the child i will be content.
 * Your goal is to maximize the number of your content children and output the maximum number.
 *
 * Created by nagen on 11/12/16.
 */
public class AssignCookies {
    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n =  g.length, m = s.length;
        int first = 0, second = 0;
        int output = 0;
        while(first < n && second < m) {
            if(g[first] <= s[second]) {
                output++;
                first++;
            }
            second++;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{5,5,2}, new int[]{0,0,0,0,1,5,5,5}));
    }

}
