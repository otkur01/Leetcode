public class SplitTheArray {
    public static boolean isPossibleToSplit(int[] nums) {
       if(nums.length%2!=0)return  false;
        for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int i1 = i; i1 < nums.length; i1++) {
                if(nums[i]==nums[i1])count++;
            }
            if(count>2)return false;
        }
     return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums));
    }

}
