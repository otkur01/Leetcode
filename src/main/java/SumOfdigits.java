public class SumOfdigits {
    public static void main(String[] args) {
        int n = 63;
        System.out.println(sumOfDigits(n));



    }

    public static int sumOfDigits(int n){
        int sumdigits = 0;

        while(n%10!=0){
           int firstdigit = n%10;
            sumdigits+=firstdigit;
            n = n/10;

        }


        return sumdigits;
    }

}
