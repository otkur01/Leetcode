import java.util.Stack;

public class BrowserHistory {

    public static void main(String[] args) {
        BrowserHistory bh=new BrowserHistory("leetcode.com");

        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println(bh.back(2));
        System.out.println(bh.forward(2));



    }
    Stack<String>hStack;
    Stack<String>fStack;
    String current;

    public BrowserHistory(String homepage) {
       hStack=new Stack<>();
       fStack=new Stack<>();
       current=homepage;
    }

    public void visit(String url) {
        hStack.push(current);
        current=url;
        System.out.println(url+" is visited");
        fStack=new Stack<>();


    }

    public String back(int steps) {

         while(steps>0 && !hStack.isEmpty()){
             fStack.push(current);
             current=hStack.pop();
             steps--;
         }
      return current;
    }

    public String forward(int steps) {

        while(steps>0 && !fStack.isEmpty()){
            hStack.push(current);
            current=fStack.pop();
            steps--;
        }
        return current;
    }



}
