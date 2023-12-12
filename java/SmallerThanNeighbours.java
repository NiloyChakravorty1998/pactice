

public class SmallerThanNeighbours {
    public static void main(String[] args) {
        System.out.println(returnPeakElement(new int[]{1,5,9,3}));
    }

    public static int returnPeakElement(int [] nums){
        int max =0;
        for(int i = 1; i < nums.length-1; i++){
            int first = nums[i-1];
            int mid = nums[i];
            int second = nums[i+1];
            if(mid > first && mid > second){
                if(mid > max){
                    max = mid;
                }
            }
    
        }    
        return max;
    }
}
