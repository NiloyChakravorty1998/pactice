import java.util.ArrayList;
import java.util.Collections;

public class MinimumDistanceBetweenWords {
    public static void main(String[] args) {
        System.out.println(
            getMinDistanceBetweenWords("the work of the tractor is done",
             "the", "done")
        );
    }
    public static int getMinDistanceBetweenWords(String sentence, String word1, String word2) {
        String [] words = sentence.split(" ");
        ArrayList<Integer> diffs = new ArrayList<Integer>(); 
        for(int i = 0; i < words.length - 1; i++) {
            if(words[i].equals(word1)){
                for(int j = i+1; j < words.length; j++) {
                    if(words[j].equals(word2)){
                        diffs.add(j-i);
                    }
                }
            }
        }
        Collections.sort(diffs);
        return diffs.get(0);
    }
}
