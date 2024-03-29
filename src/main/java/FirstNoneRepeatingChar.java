import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNoneRepeatingChar {
    public static void main(String[] args) {
        String s = "JJavaddevellloper";
        System.out.println(firstNoneRepeatingChar(s));
    }

    public static Character firstNoneRepeatingChar( String s){
        Map<Character,Integer>map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

        }
        System.out.println(map);
        for (Character c : map.keySet()) {
            if(map.get(c)==1)return c;
        }
        return null;
    }
}
