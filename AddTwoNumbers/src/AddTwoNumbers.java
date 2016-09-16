/**
 * AddTwoNumbers: Takes two LinkedList of single digit nodes
 *
 * returns new LinkedList with the sum of those two (with carry)
 *
 * Created by nagen on 9/16/16.
 */
public class AddTwoNumbers {

    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }

        static Node addNode(Node first, Node second) {
            Node output = new Node(0);
            Node curr = output;
            int carry = 0;
            while( first!= null || second != null) {
                int sum = carry + (first != null ? first.value : 0) + (second != null ? second.value : 0);
                carry = sum >= 10 ? 1 : 0;
                curr.next = new Node(sum % 10);
                curr = curr.next;

                if (first != null)
                    first = first.next;

                if (second != null)
                    second = second.next;
            }

            if (carry > 0) {
                curr.next = new Node(carry);
            }

            return output.next;
        }

        public static void main(String[] args) {
            Node L1, L2;

            L1 = new Node(5);
            L1.next = new Node(4);
            L1.next.next = new Node(3);
            L1.next.next.next = new Node(2);
            L1.next.next.next.next = new Node(1);

            L2 = new Node(3);
            L2.next = new Node(2);
            L2.next.next = new Node(7);

            Node result = addNode(L1, L2);

            printLinkedList(result);
        }

        private static void printLinkedList(Node result) {
            while (result != null) {
                System.out.print(result.value);
                result = result.next;
                if(result != null)
                    System.out.print("->");
            }
        }
    }
}
