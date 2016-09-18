/**
 * ReverseInger: take a number
 *
 * returns reverse of the number
 *
 * Created by nagen on 9/18/16.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123978801));
    }

    private static int reverseInteger(int i) {
        int ans = 0;
        while (i !=0){
            ans = ans * 10 + (i%10);
            i /= 10;
        }
        return ans;
    }
}
