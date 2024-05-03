import java.util.HashMap;

public class GenerateDocument {
    public static void main(String[] args) {
       String s = "!veDJaCyd vaeo perelo xw", t ="Cydeo Java Developer!****";
        System.out.println(GenerateDocument(s,t));
        System.out.println(GererateDoc(s,t));
        System.out.println(GenerateDoc1(s,t));
    }

    public static boolean GenerateDocument(String s, String t){

        for (int i = 0; i < s.length(); i++) {
            s.replace(s.charAt(i)+"","");
            System.out.println("hte is "+ s);
        }

        return t.isEmpty();
    }

    public static boolean GererateDoc(String s, String D){
        for (int i = 0; i < D.length(); i++) {
            char cha = D.charAt(i);
            int DCharFreq = countCharFreq( cha, D);
            int SchaFreq = countCharFreq(cha,s);
            if(DCharFreq>SchaFreq)return false;
        }

       return true;
    }

    public static int countCharFreq(Character cha, String str){
     int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(cha==str.charAt(i))count++;
        }
      return count;
    }

    public static boolean GenerateDoc1( String s, String t){
        HashMap<Character, Integer > charCount= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c,charCount.getOrDefault(c,1)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(!charCount.containsKey(t.charAt(i))|| charCount.get(t.charAt(i))==1)return false;
            charCount.put(t.charAt(i),charCount.get(t.charAt(i))-1);
        }
        return true;
    }

}
