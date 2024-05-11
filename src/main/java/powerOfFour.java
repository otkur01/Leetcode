public class powerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
    public static boolean isPowerOfFour(int n) {
     if(n<=0)return false;
     if (n==1)return true;
     return (n%4==0 && isPowerOfFour(n/4));
    }
}
