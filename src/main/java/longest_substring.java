import java.util.*;

public class longest_substring {
    public static int lengthOfLongestSubstring(String s) {

        HashMap<String, Integer> longsub = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                list.add(s.substring(i, j));

            }
        }

        System.out.println(list);
        HashMap<String, Integer> longsub1 = new LinkedHashMap<>();
        for (String eachstring : list) {
            String temp = "";
            for (int i = 0; i < eachstring.length(); i++) {
                for (int j = i+1; j < eachstring.length(); j++) {
                    if(eachstring.charAt(i)!=eachstring.charAt(j) && !temp.contains(""+eachstring.charAt(i))){
                        temp+=eachstring.charAt(i);
                    }
                    else {
                        break;
                    }
                }
                if(!temp.isEmpty()){
                    longsub1.put(temp,temp.length());
                }
            }
        }
        System.out.println(longsub1);
        int max =0;
        for (Integer value : longsub1.values()) {
             if(value>max)max = value;
        }
        return max;
    }

        public static void main (String[]args){
            String s = "abcabcaa";

            System.out.println(lengthOfLongestSubstring(s));
        }

    }

