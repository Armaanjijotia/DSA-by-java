class Solution {
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find the middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split into two lists
        Node h2 = slow.next;
        slow.next = null;

        // Reverse the second half
        h2 = reverseList(h2);

        // Compare both halves
        Node i = head;
        Node j = h2;

        while (j != null) {
            if (i.data != j.data) {
                return false;
            }
            i = i.next;
            j = j.next;
        }

        return true;
    }

    Node reverseList(Node head) {
        Node i = head;
        Node j = null;

        while (i != null) {
            Node k = i.next;
            i.next = j;
            j = i;
            i = k;
        }

        return j;
    }
}