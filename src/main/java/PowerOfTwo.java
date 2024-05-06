public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10000));
        System.out.println(isPowerOfTwo(10000));

    }


    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if(n==1)return true;
        while (n / 2 != 1 && n % 2 == 0) {
            n = n / 2;


        }


        return n == 2;
    }

    public static boolean isPowerOfTwo2(int n) {
        if (n <= 0) return false;
        if(n==1)return true;
        return (n%2 ==0 && isPowerOfTwo(n/2));
    }


}
