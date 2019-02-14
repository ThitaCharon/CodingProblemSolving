class swapNth {
    // Node indices starts from 1.
    static LinkedListNode swap_nth_node(LinkedListNode head, int n) {
        // TODO: Write - Your - Code
        if (head == null || n < 1 || n == 1) {
            return head;
        }
        LinkedListNode cur = head;
        LinkedListNode prev = null;
        LinkedListNode node = null;
        n = n - 1;
        while (cur.next != null && n > 0) {
            prev = cur;
            cur = cur.next;
            n--;
        }
        node = head;
        prev.next = node;
        node.next = cur.next;
        cur.next = prev;
        head = cur;

        return head;
    }
}