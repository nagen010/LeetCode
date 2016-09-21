
/** StringToInteger: get a string
 *
 * return the corresponding number
 * 4500
 0
 -2147483647
 *
 * Created by nagen on 9/19/16.
 */
public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(stringToInte("     +004500"));
        System.out.println(stringToInte("-+500"));
        System.out.println(stringToInteger("-2147483647"));
    }

    private static int stringToInte(String str) {
        if(str.isEmpty())
            return 0;

        double out = 0; int sign = 1, count = 0;

        char[] characters = str.toCharArray();
        while(characters[count] == ' ') {
            count++;
        }
        if(characters[count] == '-' || characters[count] == '+') {
            sign = characters[count++] == '-' ?  -1 : 1;
        }

        for(int i = count; i < characters.length; i++) {
            if(characters[i] >= '0' && characters[i] <= '9') {
                out = out * 10 + characters[i] - '0';
            } else {
                break;
            }
        }
        if(out > Integer.MAX_VALUE ){
            return sign == 1 ? sign * Integer.MAX_VALUE : sign * Integer.MIN_VALUE;
        }
        else {
            return (int)(sign * out);
        }
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
