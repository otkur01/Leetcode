public class PrintMiddleNode {

    public class ListNode {
      int val;
    ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
     }

    }

    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while(b.next!=null && b.next.next!=null){
            a = a.next;
            b = b.next.next;
        }
        if(b.next==null)return a;
        else return a.next;
    }




}
