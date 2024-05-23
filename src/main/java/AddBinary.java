public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
        System.out.println(addBinary2(a,b));


    }

    public static String addBinary(String A, String B) {
        // initialize the ith index
        int i = A.length()-1;
        // initialize the jth index
        int j = B.length()-1;
        // initialize the carry
        int carry = 0;
        // initialize the sum
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || carry == 1){
            sum = carry;
            if(i>=0) sum = sum+A.charAt(i)-'0';
            if(j>=0) sum = sum+B.charAt(j)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
    public static String addBinary2(String A, String B) {
      int lenA =A.length()-1;
      int lenB =B.length()-1;
      int trans = 0;
      int sum =0;
      String str = "";
      String result ="";
      while (lenB>=0 || lenA>=0 || trans==1){
          sum = trans;
         if(lenA>=0)sum+=(Integer.valueOf(A.charAt(lenA))-48);
         if(lenB>=0)sum+=(Integer.valueOf(B.charAt(lenB))-48);
         str+=""+(sum%2);
         trans=sum/2;
         lenB--;
         lenA--;

      }
        for (int length = str.length()-1; length >=0; length--) {
            result+=str.charAt(length)+"";
        }

  return result;
    }


}
