import java.util.Arrays;

public class MisingNumber {
    public static void main(String[] args) {
        int []nums =  {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));

    }


    public static int missingNumber(int[] nums) {
      Arrays.sort(nums);
      if(nums[nums.length-1]==nums.length-1)return nums.length;
      int result =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=i)result= i;
        }

    return result;
    }
}
