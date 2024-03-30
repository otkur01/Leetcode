import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>>list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            int r=nums.length-1;
            int l=1;
            while (r<l) {
                int sum = nums[i] + nums[r] + nums[l];

                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[r], nums[l]));
                    r--;
                    l++;
                }
                else if(sum<0){
                    r++;
                }
                else {
                    r--;
                }

            }



        }

  return list;

    }
}
