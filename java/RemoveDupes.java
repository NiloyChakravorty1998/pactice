import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupes {
    public static void main(String[] args) {
        int [] nums = new int[]{1,1,1,2,399,99,100,399};
        System.out.println(removeDupes(nums).toString());
    }

    public static ArrayList<Integer> removeDupes(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        ArrayList<Integer> result = new ArrayList<>();
        set.stream().forEach(num -> result.add(num));
        return result;
    }
}
