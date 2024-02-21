public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hi I am Niloy"));
    }
    public static String reverseWords(String str) {
        String [] words = str.split(" ");
        String res = "";
        for(int i = words.length -1; i >= 0; i--) {
            res = res + words[i] + " ";
        }
        return res;
    }
}
