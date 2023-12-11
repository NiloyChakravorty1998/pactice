public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

    public static String reverseString(String sentence){
        String [] strArr = sentence.split(" ");
        StringBuilder resStr = new StringBuilder("");
        for(int i = strArr.length -1; i>=0;i--){
            resStr.append(strArr[i]);
        }

        return resStr.toString();
    }
}
