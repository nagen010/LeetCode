/** Given a sorted array, remove the duplicates in place
 * such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.

 * Created by nagen on 10/3/16.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeD = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeD.removeDuplicates(new int[] {1,1,3}));
    }

    private int removeDuplicates(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] != array[index]) {
                index++;
                array[index] = array[i];
            }
        }
        return index+1;
    }
}