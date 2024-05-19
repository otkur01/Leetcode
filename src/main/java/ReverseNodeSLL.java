public class ReverseNodeSLL {
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
    }

        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode prev = head;
            ListNode current = head.next;

            while (current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            head.next = null;
            return prev;

        }
    }
