class Solution {

    public int length(Node head){
        int len = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        return len;
    }

    public Node rotateRight(Node head, int k) {

        if(head == null || head.next == null){
            return head;
        }

        int n = length(head);

        k = k % n;

        if(k == 0){
            return head;
        }

        Node fast = head;
        Node slow = head;

        for(int i = 0; i < k; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        Node a = slow.next;

        slow.next = null;

        fast.next = head;

        return a;
    }
}