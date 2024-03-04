public class SumOfTwoLinked {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        while (l1.next != null && l2 != null) {
            int count =0;
            if(l1.val+ l2.val>=10){
                l3.val = (l1.val+ l2.val)%10;
                count = (l1.val+ l2.val)/10;
            }
            else {
                l3.val = l1.val+ l2.val;
            }
            l3.val+=count;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }
        return l3;
    }
}
