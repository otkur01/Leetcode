

import java.util.HashSet;
import java.util.Set;

public class FindCylcleSLL {

    public void main(String[] args) {
        ListNode myNode = new ListNode(1);
        ListNode myNode1 = new ListNode(1);
        ListNode myNode2 = new ListNode(3);
        ListNode myNode3 = new ListNode(4);
        ListNode myNode4 = new ListNode(5);
        myNode.next=myNode1;
        myNode1.next=myNode2;
        myNode2.next=myNode3;
        myNode3.next=myNode4;
       deleteDuplicates(myNode);


    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode myNode = new ListNode();



    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) return true;
            set.add(current);
            current = current.next;
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

    public ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            current = nextNode;


        }
        return head;


    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempHead = new ListNode();
        ListNode prev = tempHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if(list1==null)prev.next=list2;
        else prev.next=list1;

        return tempHead.next;

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;

        ListNode current = head;

        while (current != null&& current.next!=null ) {
            if(current.val==current.next.val){
                current.next = current.next.next;
            }
            else{
                current=current.next;
            }

        }



        return head;
    }

}


