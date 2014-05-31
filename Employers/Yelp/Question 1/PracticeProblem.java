import java.util.HashMap;
import java.util.HashSet;
public class PracticeProblem {

    public static void main(String[] args) {
        String[] words = {"cat", "act", "god", "dog", "tim", "jim"};
        HashMap<String, HashSet<String>> anagramMap = getAnagram(words);
        System.out.println("Anagrams for cat: " + anagramMap.get(serialize("cat")));
        System.out.println("Anagrams for dog: " + anagramMap.get(serialize("dog")));
    }

    public static HashMap<String, HashSet<String>> getAnagram(String[] words) {
        HashMap<String, HashSet<String>> anagramMap = new HashMap<String, HashSet<String>>();

        for (String word : words) {
            if (anagramMap.get(serialize(word)) == null) {
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add(word);
                anagramMap.put(serialize(word), hashSet);
            } else {
                HashSet<String> set = anagramMap.get(serialize(word));
                set.add(word);
            }
        }
        return anagramMap;
    }

    public static String serialize(String word) {
        int[] serialized = new int[256];
        for (char c : word.toCharArray()) {
            serialized[c]++;
        }
        return java.util.Arrays.toString(serialized);
    }
}
