public class NumberOf1Bits {

    public static void main(String[] args) {
        System.out.println(hammingWeight(128));


    }
    public static int hammingWeight(int n) {
       int num1=0;
       while (n/2!=0){
           if(n%2==1)num1++;
           n=n/2;

       }
     return num1+1;
    }



}
