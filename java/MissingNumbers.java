import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {
        List<Integer> res = findMissingNums(new int[] { 1,4,4,6,10 });
        System.out.println(res.toString());
    }

    // 1,4,4,6,10 -> 2,3,5,7,8,9
    public static List<Integer> findMissingNums(int[] nums) {
        List<Integer> missingNums = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int first = nums[i];
            int second = nums[i+1];
            if(first == second){
                continue;
            }else{
                for(int j = first +1; j<second;j++){
                    missingNums.add(j);
                }
            }
        }

        return missingNums;
    }
}
