import java.util.HashMap;

/**
 * Two Sum: Takes an array and Target value
 *
 * returns indices of the arrays that gets the sum
 *
 * Created by nagen on 9/16/16.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 8, 9, 10};
        int target = 17;
        int[] output = getIndices(array, target);
        for (int i: output) {
            System.out.print(i + " ");
        }
    }

    private static int[] getIndices(int[] array, int target) {
        HashMap<Integer, Integer> output = new HashMap<>();
        int difference;
        for(int i = 0; i < array.length; i++) {
            difference = target - array[i];
            if(output.containsKey(difference)){
                return new int[]{output.get(difference), i};
            }
            output.put(array[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

}
