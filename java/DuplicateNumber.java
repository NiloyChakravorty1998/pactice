
import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] arr = new int[]{1,1,2,3,55,55};
        getDupes(arr);
    }

    public static void getDupes(int [] nums){
        HashSet<Integer> resSet = new HashSet<Integer>();
        for(int i = 0; i<nums.length;i++){
            if(!resSet.add(nums[i])){
                System.out.println(" Dupe of " +nums[i] +" at pos : " +i);
            }
            else{
                resSet.add(nums[i]);
            }
        }
    }
}
