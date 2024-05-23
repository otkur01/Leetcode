public class InsertPosition {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,5,6};
        System.out.println(searchInsert(arr,5));
        System.out.println(searchInsert1(arr,0));


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

    public static int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }



}
