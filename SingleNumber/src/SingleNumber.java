/** Given an array of integers, every element appears twice except for one. Find that single one.
 * Created by nagen on 10/6/16.
 */
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(new int[]{1,1,2,2,3}));
        System.out.println(sn.singleNumber(new int[]{1,1,2,2,3,3,7}));
    }

    private int singleNumber(int[] array) {
        int result = 0;
        for (int anArray : array) {
            result ^= anArray;
        }
        return result;
    }
}
