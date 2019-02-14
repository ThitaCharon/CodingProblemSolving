class nthFromLast {
    public static LinkedListNode find_nth_from_last(LinkedListNode head, int n) {
        // Write - Your - Code

        LinkedListNode tail = head;
        // find by get difference from distance head->o ->o ->o tail
        while (tail != null && n > 0) {
            tail = tail.next;
            --n;
        }

        while (tail != null) {
            head = head.next;
            tail = tail.next;
        }

        return head;
    }
}