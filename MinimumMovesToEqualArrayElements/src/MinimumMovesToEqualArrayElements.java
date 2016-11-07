import java.util.stream.IntStream;

/**
 * Given a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1
 *
 * Created by nagen on 11/6/16.
 */
public class MinimumMovesToEqualArrayElements {

    public static void main(String[] args) {
        System.out.println(findMoves(new int[] {1,2,3}));
    }

    private static int findMoves(int[] input) {
        return IntStream.of(input).sum() - (input.length * IntStream.of(input).min().getAsInt());
    }

}
