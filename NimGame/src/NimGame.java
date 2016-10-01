/** NimGame: You are playing the following Nim Game with your friend:
 *  There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 *  The one who removes the last stone will be the winner.
 *  You will take the first turn to remove the stones.
 * Created by nagen on 9/30/16.
 */
public class NimGame {
    private static boolean canWinNim(int n) {
        return n%4 > 0;
    }
    public static void main(String[] args) {
        System.out.println(canWinNim(5));
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(12344));
    }
}
