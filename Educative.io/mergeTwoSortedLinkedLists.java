class mergeSortList {
    public static LinkedListNode merge_sorted(LinkedListNode head1, LinkedListNode head2) {
        // TODO: Write - Your - Code
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        LinkedListNode cur1 = head1;
        LinkedListNode cur2 = head2;
        LinkedListNode mergeHead = null;
        LinkedListNode tail = mergeHead;
        // get the starting head
        if (cur1.data <= cur2.data) {
            mergeHead = cur1;
            cur1 = cur1.next;
        } else if (cur2.data < cur1.data) {
            mergeHead = cur2;
            cur2 = cur2.next;
        }

        while (cur1 != null && cur2 != null) {
            LinkedListNode node = null;
            if (cur1.data <= cur2.data) {
                node = cur1;
                cur1 = cur1.next;
            } else {
                node = cur2;
                cur2 = cur2.next;
            }
            tail.next = node;
            tail = node;
        }

        while (cur2 != null) {
            tail.next = cur2;
            tail = cur2;
            cur2 = cur2.next;
        }
        while (cur1 != null) {
            tail.next = cur1;
            tail = cur1;
            cur1 = cur1.next;
        }

        return mergeHead;
    }
}