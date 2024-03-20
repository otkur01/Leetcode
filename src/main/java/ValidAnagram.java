import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
        System.out.println(isAnagram2(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer>maps= new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            maps.put(ch, maps.getOrDefault(ch, 0) + 1);
        }

        Map<Character,Integer>mapt= new LinkedHashMap<>();
        for (char ch : t.toCharArray()) {
            mapt.put(ch, mapt.getOrDefault(ch, 0) + 1);
        }
    return maps.equals(mapt);
    }
    public static boolean isAnagram2(String s, String t) {
        Map<Character, Long> characterFrequency = s.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // creates a
        // Map<Character, Long>
        // where the Long is
        // the frequency
        Map<Character, Long> characterFrequency1 = t.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); //
      return characterFrequency1.equals(characterFrequency);
    }


}
