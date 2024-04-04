import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "mississippi";

       
        str = str.toLowerCase();

        
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        
        for (char c : str.toCharArray()) {
           
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        
        System.out.println("Duplicate characters:");
        boolean foundDuplicate = false;
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }
}
