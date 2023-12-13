import java.util.ArrayList;

public class LongestSubstringWithoutRepeatation {
    public static void main(String[] args) {
        System.out.println(getLongestSubstringWithoutRepeatation("Apple"));
    }
    public static String getLongestSubstringWithoutRepeatation(String string) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i =0; i<string.length()-1;i++){
            String res ="";
            for(int j=i+1; j<string.length();j++){
                if(string.charAt(i) != string.charAt(j)){
                    res= res + String.valueOf(string.charAt(i));
                }
                else break;
            }
            list.add(res);
        }        
        list.stream().forEach(element -> System.out.println(element));
        return "";
    }
    
}
