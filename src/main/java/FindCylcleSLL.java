import java.util.HashSet;
import java.util.Set;

public class FindCylcleSLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, PrintMiddleNode.ListNode next) { this.val = val; this.next = next;
        }

    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode>set = new HashSet<>();
        ListNode current = head;
        while (current!=null){
           if(set.contains(current))return true;
           set.add(current);
           current=current.next;
        }



        return false;

    }
}
