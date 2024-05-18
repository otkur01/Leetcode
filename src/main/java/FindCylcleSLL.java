import java.util.HashSet;
import java.util.Set;

public class FindCylcleSLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
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
    public boolean hasCycle2(ListNode head) {
        if (head == null) return false;

        // ListNode temp = head, temp2 = temp.next;
        // while (temp != null && temp2 != null && temp != temp2) {
        //     temp = temp.next;
        //     temp2 = temp2.next;
        //     if (temp2 == null) continue;
        //     temp2 = temp2.next;
        // }

        // return temp != null && temp2 != null && !(temp == null && temp2 == null);

        //  if (head == null) return false;

        ListNode temp = head, temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next.next;
            if (temp == temp2) break;
        }

        return temp2 != null && temp2.next != null;
    }



}
