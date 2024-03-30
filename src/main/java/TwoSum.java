import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

       int[] arry= {3,2,4};
        System.out.println(Arrays.toString(twoSum2(arry,6)));

    }

    public static int[] twoSum(int[] nums, int target) {

        int [] result = new int [2];

        for(int i =0; i<nums.length;i++){
            for(int j =i+1;j<nums.length; j++ ){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;


                }
            }


        }
        return result;


    }
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer>numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target-nums[i];
            if(numsMap.containsKey(result))return  new  int []{i,numsMap.get(result)};
            else{
            numsMap.put(nums[i],i);}

        }

        return new int[]{};
    }
    
}
