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
        int ans = 0, tail, temp;
        while (i !=0){
            tail = i%10;
            temp = ans * 10 + tail;
            if((temp - tail) / 10 != ans) {
                return  0;
            }
            ans = temp;
            i /= 10;
        }
        return ans;
    }
}
