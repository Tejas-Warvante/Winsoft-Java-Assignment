import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java is a programming language that is widely used for software development";

       
        String[] words = str.split("\\s+");

        
        HashMap<String, Integer> wordCountMap = new HashMap<>();

       
        for (String word : words) {
           
            String lowercaseWord = word.toLowerCase();
           
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        
        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }

        
        int totalWords = words.length;
        System.out.println("Total number of words: " + totalWords);
    }
}