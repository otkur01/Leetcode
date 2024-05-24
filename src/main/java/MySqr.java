public class MySqr {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));


    }

    public static int mySqrt(int x) {
        int first = 0;
        int last = (x/2)+1;
        while (first<last) {

            int mid = first + (last - first) / 2 + 1;
            if(mid*mid==x)return mid;
            else if(mid*mid<x){
               first=mid;
            }
            else {
                last=mid-1;
            }


        }

        return first;
    }
}
//    long left = 0, right = (x / 2) + 1;
//
//        while (left < right) {
//        long mid = left + (right - left) / 2 + 1;
//        long square = mid * mid;
//
//        if (square == x) {
//        return (int) mid;
//        } else if (square < x) {
//        left = mid;
//        } else {
//        right = mid - 1;
//        }
//        }
//
//        return (int) left;