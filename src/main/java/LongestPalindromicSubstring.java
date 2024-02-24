import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class LongestPalindromicSubstring {
    public  static String longestPalindrome(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list.add(s.substring(i, j));

            }
        }
        System.out.println(list);
        HashMap<String, Integer> longsub1 = new LinkedHashMap<>();
        for (String eachstring : list) {
            String revers = "";
            for (int i = eachstring.length() - 1; i >= 0; i--) {
                revers += eachstring.charAt(i);
            }
            if (eachstring.equals(revers)) {
                longsub1.put(eachstring, eachstring.length());
            }
        }

        System.out.println(longsub1);
        int max =0;
        for (Integer value : longsub1.values()) {
            if(value>max)max = value;
        }

        for (String string : longsub1.keySet()) {
            if(string.length()==max)return string;
        }
        return "";


    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

}
