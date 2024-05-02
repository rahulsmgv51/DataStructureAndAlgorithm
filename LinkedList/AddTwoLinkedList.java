package LinkedList;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class AddTwoLinkedList {

    public static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        head.next = null;

        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }

    public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode h1 = reverseLL(head1);
        ListNode h2 = reverseLL(head2);
        int carry = 0;
        ListNode ans = null;
        ListNode temp = null;

        while (h1 != null || h2 != null || carry != 0) {
            int sum = carry;
            if (h1 != null) {
                sum += h1.val;
                h1 = h1.next;
            }
            if (h2 != null) {
                sum += h2.val;
                h2 = h2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            if (ans == null) {
                ans = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        printLL(ans);
        ListNode res = reverseLL(ans);
        printLL(res);
        return null;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        ListNode n11 = new ListNode(9);
        ListNode n12 = new ListNode(9);
        head1.next = n11;
        n11.next = n12;
        ListNode head2 = new ListNode(9);
        ListNode n21 = new ListNode(9);
        ListNode n22 = new ListNode(9);
        head2.next = n21;
        n21.next = n22;
        // ListNode h1 = reverseLL(head1);
        // printLL(h1);
        // ListNode h2 = reverseLL(head2);
        // printLL(h2);
        ListNode h = addTwoNumbers(head1, head2);
        printLL(h);

    }
}