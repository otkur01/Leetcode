import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
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


}
