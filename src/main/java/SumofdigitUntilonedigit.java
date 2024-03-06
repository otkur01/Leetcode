public class SumofdigitUntilonedigit {
    public static void main(String[] args) {
        int n = 493193;
        System.out.println(sumofDigitsUntilOne(n));


    }

    public static  int sumofDigitsUntilOne(int n){
        int sumdigits = 0;

        while(n%10!=0){
            int firstdigit = n%10;
            sumdigits+=firstdigit;
            n = n/10;

        }

        int sumUntilone=0;
        while (sumdigits%10!=0){
            int fisrtdigits = sumdigits%10;
            sumUntilone+=fisrtdigits;
            sumdigits =sumdigits/10;
        }

       if(sumUntilone>=10)return sumUntilone/10+sumUntilone%10;


      return sumUntilone;
    }

}
