public class ReverseASentence {
    public static void main(String[] args) {
        System.out.println(reverseASentence("I am Niloy"));
    }
    public static String reverseASentence(String sentence){
        String [] resArr = sentence.split(" "); 
        String res="";

        for(int i = resArr.length -1;i>=0; i--){
            res = res +" " +resArr[i];
        }
        return res;
    }
}
