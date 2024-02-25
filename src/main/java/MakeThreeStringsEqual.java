public class MakeThreeStringsEqual {
    public static int findMinimumOperations(String s1, String s2, String s3) {
        if((s1.charAt(0)!=s2.charAt(0)) || (s3.charAt(0)== s2.charAt(0) )) return -1;
        int len = Math.min(s1.length(),Math.min(s2.length(),s3.length()));

        String temp ="";
        for (int i = 0; i < len; i++) {
            if((s1.charAt(i)==s2.charAt(i)) && (s3.charAt(i)== s2.charAt(i)))temp+=s1.charAt(i);
            else {
                break;
            }
        }
        if(temp.isEmpty())return -1;

        return  s1.length()-temp.length()+ s2.length()-temp.length()+ s3.length()-temp.length();
    }


    public static void main(String[] args) {
       String s1 = "abc", s2 = "abb", s3 = "ab";
        System.out.println(findMinimumOperations(s1,s2,s3));
    }

}
