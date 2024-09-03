package DSNReview;

import java.util.Arrays;
import java.util.Stack;

public class Array {
     public static void main(String[] args) {



         System.out.println(Arrays.toString( arrayReplace(new int[]{2,7,8,9,6,2,4})));
         System.out.println(Arrays.toString( arrReplaceInPlace(new int[]{2,7,8,9,6,2,4})));
         System.out.println(Arrays.toString( arrReplaceStack(new int[]{2,7,8,9,6,2,4})));
        int[]ar =new int[]{2,7,8,9,6,2,4};
                arrReplaceRecursion(ar, 0, 6);
         System.out.println(Arrays.toString(ar));

    }
    public static int[] arrayReplace(int [] arr){
         int [] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[arr.length-1-i];
        }

      return newArr;
    }

    public static int[] arrReplaceInPlace(int [] arr){
       int start = 0;
       int end = arr.length-1;

       while (start<end){
           int temp = 0;
           temp = arr[start];
           arr[start] = arr[end];
           arr[end]= temp;
           start++;
           end--;

       }

      return arr;
    }

    public static void arrReplaceRecursion(int[]arr, int start,  int end){
         int temp;
        if (start>=end) return ;
      temp = arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
     arrReplaceRecursion(arr, start+1, end-1);


    }

    public static int[] arrReplaceStack(int []  arr){
        Stack<Integer>stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }

        return arr;
    }
    public static <T> T[] arrReplaceStack(T[] arr) {
        Stack<T> stack = new Stack<>();

        // Push elements onto the stack
        for (T element : arr) {
            stack.push(element);
        }

        // Pop elements from the stack back into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        return arr;
    }


}
