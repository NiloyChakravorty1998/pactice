import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAndRepeating {
    public static void main(String[] args) {
        getMissingAndRepeating(new int[] { 1,2,2,4 }).forEach(element -> System.out.println(element));
    }

    public static List<Integer> getMissingAndRepeating(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int missing = 0, repeating = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int e = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (e == nums[j]) {
                    repeating = nums[j];
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int e = nums[i];
            for (int j = e + 1; j < nums[i + 1]; j++) {
                missing = j;
            }
        }

        res.add(repeating); res.add(missing);
        return res;
    }
}