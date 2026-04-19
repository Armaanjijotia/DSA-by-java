class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode mid = findMiddle(head);
        TreeNode root = new TreeNode(mid.val);

        // left part
        root.left = sortedListToBST(head);

        // right part
        root.right = sortedListToBST(mid.next);

        return root;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // cut left half
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}