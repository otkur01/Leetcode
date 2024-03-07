import java.util.*;

public class CountAndSay {
    public static void main(String[] args) {
         int n = 3322251;
        System.out.println(CountSay(n));


    }

    public static String CountSay(int n1){
        Map<Character,Integer>map = new LinkedHashMap<>();
        String a = String.valueOf(n1);
        char [] cha = a.toCharArray();

        for (int i = 0; i <cha.length; i++) {
            if(map.containsKey(a.charAt(i)))
            {
                int n= map.get(a.charAt(i))+1;
                map.put(a.charAt(i), n);
            }

            else
            {
                map.put(a.charAt(i), 1);
            }

            }
        System.out.println(map);

        String result ="";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result +=entry.getValue()+""+ entry.getKey();
        }
       return result;
    }
}
