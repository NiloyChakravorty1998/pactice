
import java.util.Arrays;

public class AnagramProg {
    public static void main(String[] args) {
        System.out.println(isAnagram("bdcf","cbfd"));
    }
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        String[] str1Arr = str1.split("");
        String[] str2Arr = str2.split("");

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        for(int i = 0; i < str1Arr.length; i++){
            if(!str1Arr[i].equals(str2Arr[i])){
                return false;
            }
        }
        return true;
    }
}