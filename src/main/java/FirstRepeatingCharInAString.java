import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharInAString {
    public static void main(String[] args) {
        String s = "Java developer";
        System.out.println(firstRepeatingChar(s));
    }

    public static Character firstRepeatingChar(String s){
        Set<Character>characters = new HashSet<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(!characters.add(s.toCharArray()[i]))return s.toCharArray()[i];
        }

    return null;
    }
}
