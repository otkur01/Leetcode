import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static void main(String[] args) {
        int [] arr = {1,8,9,6,5,4,3,2,11,12,13,10,0};
        System.out.println(Arrays.toString(LargerRange(arr)));


    }



    public static int[] LargerRange(int [] arr){
         int [] result = new int[2];
         int LongestRangeLength = 0;
        Map<Integer, Boolean> numsMap = new HashMap<>();
        for (Integer i:arr) {
            numsMap.put(i, true);
        }

        for (int i: arr) {
            if(!numsMap.get(i))continue;
            int currentLength = 1;
            int right = i+1;
            int left = i-1;
            while (numsMap.containsKey(right)){
                numsMap.put(right,false);
                currentLength++;
                right++;
            }
            while (numsMap.containsKey(left)){
                numsMap.put(left,false);
                currentLength++;
                left--;
            }
            if(currentLength>LongestRangeLength){
                LongestRangeLength=currentLength;
                result = new int[]{left+1,right-1};
            }

        }


     return result;
    }
}
