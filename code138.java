class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;

        // Step 1
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3
        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;

        while (curr != null) {
            Node copy = curr.next;

            copyCurr.next = copy;
            copyCurr = copy;

            curr.next = copy.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}