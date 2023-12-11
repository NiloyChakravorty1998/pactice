import java.util.HashMap;

public class CountLetters {
    public static void main(String[] args) {
        HashMap<String,Integer> resMap = getCount("Apple");
        resMap.forEach((k,v) -> System.out.println(" key : " +k +" value : " +v));
    }

    public static HashMap<String,Integer> getCount(String str){
        HashMap<String,Integer> resMap = new HashMap<>();
        for(int i =0; i<str.length();i++){
        String letter = String.valueOf(str.charAt(i));   
        if(resMap.containsKey(letter)){
            int count = resMap.get(letter);
            resMap.put(letter,count+1);
            } else{
                resMap.put(letter,1);
           }  
        }
        return resMap;
    }
}


