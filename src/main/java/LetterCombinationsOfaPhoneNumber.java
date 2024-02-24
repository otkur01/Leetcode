import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        Map<String,Integer> phone = new Hashtable<>();
        phone.put("a",2);
        phone.put("b",2);
        phone.put("c",2);
        phone.put("d",3);
        phone.put("e",3);
        phone.put("f",3);
        phone.put("g",4);
        phone.put("h",4);
        phone.put("i",4);
        phone.put("j",5);
        phone.put("k",5);
        phone.put("l",5);
        phone.put("m",6);
        phone.put("n",6);
        phone.put("o",6);
        phone.put("p",7);
        phone.put("q",7);
        phone.put("r",7);
        phone.put("s",7);
        phone.put("t",8);
        phone.put("u",8);
        phone.put("v",8);
        phone.put("w",9);
        phone.put("x",9);
        phone.put("y",9);
        phone.put("z",9);
       int num = Integer.valueOf(digits);
        int first = num%10;
        num = num/10;
        int second = num%10;
        List<String>str1 = new ArrayList<>();
        for (String s : phone.keySet()) {
            if(phone.get(s)==first){

                str1.add(s);
            }
        }

        List<String>str2 = new ArrayList<>();
        for (String s : phone.keySet()) {
            if( phone.get(s)==second){

                str2.add(s);
            }
        }
        List<String>str = new ArrayList<>();

        for (int i = 0; i < str2.size(); i++) {
           String hold = "";
            String temp = str2.get(i);

            for (int i1 = 0; i1 < str1.size(); i1++) {
                hold = temp + str1.get(i1);

                str.add(hold);
            }
        }

       return str;
    }

    public static void main(String[] args) {
        String s = "89";
        System.out.println(letterCombinations(s));
    }
}
