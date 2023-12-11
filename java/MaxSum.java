import java.util.Arrays;

public class MaxSum {
    public static void main(String[] args) {
        int[] nums = { 100, 9, 10 };
        System.out.println("max : " +calculateMaxSum(nums));
    }

    public static int calculateMaxSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) { // 1,2,10 -> 12
            for(int j=i+1;j<nums.length;j++){
                int check = nums[i] + nums[j];
                if(check > max ){
                    max = check;
                }
            }
        }

        return max;
    }
}
