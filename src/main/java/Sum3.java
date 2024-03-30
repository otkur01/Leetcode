import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       Set<List<Integer>> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int l= i+1;
            int r = nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[r]+nums[l];
                if(sum==0) {
                    list.add(Arrays.asList(nums[i], nums[r], nums[l]));
                   r--;
                }
                if(sum>0){
                    r--;
                }
                else {
                    l++;
                }

            }
        }
        List<List<Integer>>list1 = new ArrayList<>(list);
       return list1;
    }
}
