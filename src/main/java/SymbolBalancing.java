import java.util.Stack;

public class SymbolBalancing {
    public static void main(String[] args) {
        System.out.println(balanceCheck("*(){()}"));
    }

    public static boolean balanceCheck(String str){
        Stack<Character>myStack= new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character each= str.charAt(i);
            if(each!='(' &&each!='[' &&each!='{' &&each!=')' &&each!=']' &&each!='}')continue;
            if(each=='('||each=='['||each=='{' ){
                myStack.push(each);
                continue;
            }

            if (myStack.isEmpty())return false;
            switch (each){
                case ')':
                    if (myStack.pop()!='(')return false;
                    break;
                case ']':
                    if (myStack.pop()!='[')return false;
                    break;
                case '}':
                    if (myStack.pop()!='{')return false;
                    break;

            }
        }


     return myStack.isEmpty();
    }


}
