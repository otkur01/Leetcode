import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MisingNumber {
    public static void main(String[] args) {
        int []nums =  {0,1};
        System.out.println(missingNumber(nums));

    }


    public static int missingNumber(int[] nums) {
     int range = nums.length;
        Set<Integer>set= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= range; i++) {
            if(!set.contains(i))return i;

        }
        return 0;
    }
    public static int missingNumber2(int[] nums) {
        int sum=0;
        int totalNumSum=(nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return totalNumSum - sum;
    }
}
