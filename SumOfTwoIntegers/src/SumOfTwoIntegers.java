/** Calculate the sum of two integers a and b,
 * but you are not allowed to use the operator + and -.
 * Created by nagen on 10/5/16.
 */
public class SumOfTwoIntegers {

    public static void main(String[] args) {
        SumOfTwoIntegers sum = new SumOfTwoIntegers();
        System.out.println(sum.add(1,2));
        System.out.println(sum.add(5,2));
        System.out.println(sum.add(5,12345));
    }

    private int add(int a, int b) {
        if (b == 0)
            return a;
        else
            return add(a^b, (a&b) << 1);
    }
}
