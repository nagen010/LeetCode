/** Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.


 * Created by nagen on 10/2/16.
 */
public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 3, 4, 3}, 3));
        System.out.println(removeElement(new int[]{1, 2, 3, 3}, 3));
    }

    private static int removeElement(int[] array, int val) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != val)
                array[length++] = array[i];
        }
        return length;
    }
}
