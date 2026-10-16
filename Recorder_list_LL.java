class Solution {
    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        // 1. Find the middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half
        Node curr = slow.next;
        slow.next = null;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. Merge both halves
        Node first = head;
        Node second = prev;

        while (second != null) {
            Node next1 = first.next;
            Node next2 = second.next;

            first.next = second;
            second.next = next1;

            first = next1;
            second = next2;
        }
    }
}