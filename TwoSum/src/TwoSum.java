import java.util.*;

/**
 * Two Sum: Takes an array and Target value
 *
 * returns indices of the arrays that gets the sum
 *
 * Created by nagen on 9/16/16.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 8, 9, 10, 7, 6,11};
        int target = 17;
        Arrays.stream(getIndices(array, target)).forEach(System.out::println);

        getIndicesList(array,target).forEach(items->
                System.out.println("pair : " + items.key + ", " + items.value)
        );
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

    private static List<MyEntry<Integer,Integer>> getIndicesList(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<MyEntry<Integer,Integer>> outputList = new ArrayList<>();
        int difference;
        for(int i = 0; i < array.length; i++) {
            difference = target - array[i];
            if(map.containsKey(difference)) {
                outputList.add(new MyEntry<>(map.get(difference), i));
            }
            map.put(array[i],i);
        }
        return outputList;
    }

    private static class MyEntry<K,V> implements Map.Entry<K,V> {
        private final K key;
        private final V value;

        MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            return value;
        }
    }

}
