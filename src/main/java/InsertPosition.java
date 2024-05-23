public class InsertPosition {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,5,6};
        System.out.println(searchInsert(arr,5));


    }

    public static int searchInsert(int[] nums, int target) {

        int index =0;
        for (int i = 0; i < nums.length; i++) {
        if(nums[i]==target) return i;
   }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>target) return i;
            else index=nums.length;
        }



    return index;
    }
}
