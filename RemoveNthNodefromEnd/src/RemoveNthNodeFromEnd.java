
/** RemoveNthNodeFromEnd: Given a linked list, remove the nth node from the end of list
 * return its head.
 * Created by nagen on 9/24/16.
 */
public class RemoveNthNodeFromEnd {
    private static class ListNode {
        int value;
        ListNode next;
        ListNode(int v){
            this.value = v;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        ListNode input = new ListNode(2);
        input.next = new ListNode(3);
        input.next.next = new ListNode(4);
        input.next.next.next = new ListNode(5);
        input.next.next.next.next = new ListNode(6);

        printLinkedList(removeNthNodeFromEnd(input, 3));
        printLinkedList(removeNthNodeFromEnd(input, 2));

    }

    private static ListNode removeNthNodeFromEnd(ListNode input, int n) {
        if(input == null)
            return null;

        ListNode fast = input;
        ListNode slow = input;

        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if(fast == null) {
            return input.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return input;
    }

    private static void printLinkedList(ListNode result) {
        while (result != null) {
            System.out.print(result.value);
            result = result.next;
            if(result != null)
                System.out.print("->");
        }
        System.out.printf("\n");
    }

}
