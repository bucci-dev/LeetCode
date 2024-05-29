import java.util.List;
import java.util.Stack;


public class reverseList {
    public static void main(String args[]) {

    }
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode previous = null;
        ListNode current = head;


        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }


        return previous;
    }
}
