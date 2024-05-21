import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));


    }

    public static int romanToInteger( String str){
        Map<String, Integer>map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);

        int sum = 0;
        int index =0;
        while (index<str.length()){
            String current = str.substring(index,index+1);
            int currentValue = map.get(current);
            int nextvalue =0;
            if(index+1<str.length()){
                String nextSymble = str.substring(index+1,index+2);
                nextvalue=map.get(nextSymble);
            }

            if(currentValue<nextvalue){
                sum+=(nextvalue-currentValue);
                index+=2;

            }
              else {
                  sum+=currentValue;
                  index++;
            }
        }
  return sum;
    }

}
