import java.util.ArrayList;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
    getMinMax(new int[]{1,2,99,26,88,-1,0}).forEach(str -> System.out.println(str));
    }
    public static List<String> getMinMax(int [] nums){
        int min =0, max =0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<=min){
                min = nums[i];
            }
            if(nums[i] >= max){
                max = nums[i];
            }
        }
        list.add("min : " +min);
        list.add("max : " +max);
        return list;
}
}


