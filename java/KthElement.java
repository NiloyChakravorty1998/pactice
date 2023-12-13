import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthElement {
    public static void main(String[] args) {
        findKthLargestAndSmallest(new int[]{1,9,0,10,15,2}, 2).forEach(e -> System.out.println(e));
    }
    public static List<String> findKthLargestAndSmallest(int [] nums, int k){
        List<String> result = new ArrayList<>();
        Arrays.sort(nums);
        if(k>=0 && k<nums.length){
            result.add("Min : " +nums[k-1]);
            result.add("Max : " +nums[nums.length-k]);
        }
        return result;
    }
}
