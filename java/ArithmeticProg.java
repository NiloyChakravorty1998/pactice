import java.util.Arrays;

public class ArithmeticProg {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(isInAP(arr));
        int [] arr1 ={19,28,10};
        System.out.println(isInAP(arr1));
    }

    public static boolean isInAP(int[] arr) {
        boolean flag = false;
        Arrays.sort(arr);

        int cd = arr[1] - arr[0];
        for(int i =0; i<arr.length-1; i++){
            if(cd == arr[i+1] - arr[i]){
                flag = true;
            }
            else{
                flag = false;
                return false;
            }
        }    
        return flag;
    }
}
