
/** StringToInteger: get a string
 *
 * return the corresponding number
 *
 * Created by nagen on 9/19/16.
 */
public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(stringToInteger("     +004500"));
    }

    private static int stringToInteger(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        double output = 0;
        char[] characters = str.toCharArray();
        int sign = 1, size = 0;

        for(char c : characters){
            size ++;
            if( c >='0' && c <='9' ){
                output = output * 10 + (c - '0');
            }else if( c == '-' && size == 1){
                sign = -1;
            }else if( c == '+' && size == 1){
                sign =  1;
            }else if( c == ' ' && size == 1){
                size --;
            }else{
                break;
            }
        }
        if( output > Integer.MAX_VALUE ){
            return sign == 1 ? sign * Integer.MAX_VALUE : sign * Integer.MIN_VALUE;
        }
        else {
            return (int)(sign * output);
        }
    }
}
