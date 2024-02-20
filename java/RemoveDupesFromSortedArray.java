import java.util.ArrayList;

public class RemoveDupesFromSortedArray {
    public static void main(String[] args) {
        removeDupesFromSortedArray(new int[] { 1, 2, 2, 3 });
    }

    public static void removeDupesFromSortedArray(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (array[0] != array[1]) {
            result.add(array[0]);
        }
        if (array[array.length - 1] != array[array.length - 2]) {
            result.add(array[array.length - 1]);
        }

        for (int i = 1; i < array.length - 1; i++) {
            int current = array[i];
            int next = array[i + 1];
            int prev = array[i - 1];

            if (current != next && current != prev) {
                result.add(current);
            }
        }
        System.out.println(result.toString());
    }

}
