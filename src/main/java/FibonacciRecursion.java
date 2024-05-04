public class FibonacciRecursion {
    public static void main(String[] args) {
//        System.out.println(fib(10));
//        System.out.println(fib2(10));
        System.out.println(fib3(50));
    }

    public static int fib(int n){
        if(n==0)return 0;
        if (n==1)return 1;
        return fib(n-1)+fib(n-2);

    }
    public static int fib2(int n){
        if(n==0)return 0;
        if (n==1)return 1;
        int sum=0;
        for (int i = 2; i <=n; i++) {

        }
     return sum;
    }

    public static int fib3(int n) {
        if(n <= 1){
            return n;
        }
        int prev1 = 1, prev2 = 0;
        int current = prev1 + prev2;
        for(int i = 2; i <= n; i++){
            current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }


}
