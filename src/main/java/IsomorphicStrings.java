import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class IsomorphicStrings {
    public static void main(String[] args) {
          String s = "bbbaaaba", t = "aaabbbba";
        System.out.println(isIsomorphic1(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        Hashtable<Character,Integer>s1 = new Hashtable<>();
        Hashtable<Character,Integer>t1 = new Hashtable<>();
        for (Character c : s.toCharArray()) {
            s1.merge(c, 1, Integer::sum);
        }
        for (Character c : t.toCharArray()) {
            t1.merge(c, 1, Integer::sum);
        }
        if(s1.size()==t1.size())return true;
       return false;
    }

    public static boolean isIsomorphic1(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(Integer i = 0; i <s.length(); i ++) {
            if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
                System.out.println(map1);
                System.out.println(map2);
                return false;
            }
        }
        return true;
    }
}


