public class MinimumSumOfMountainTripletsI {
    public static int minimumSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length ; i++) {

                for (int i1 = i + 1; i1 < nums.length; i1++) {
                      for (int i2 = i1 + 1; i2 < nums.length; i2++) {

                            if (nums[i1] < nums[i2] && nums[i] < nums[i1] ) sum1 = nums[i] + nums[i1] + nums[i2];
                             if (nums[i1] > nums[i2] && nums[i] < nums[i1]) sum2 = nums[i] + nums[i1] + nums[i2];
                            if (sum1 > sum2) return sum2;
                            if (sum1 < sum2)return sum1;
                        }


                    }
                }




        return -1;

    }

    public static void main(String[] args) {
        int [] nums ={8,6,1,5,3};
        System.out.println(minimumSum(nums));
    }

}
