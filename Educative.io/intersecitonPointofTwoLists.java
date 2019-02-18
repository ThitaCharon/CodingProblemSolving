class Intersect {
    public static LinkedListNode intersect(LinkedListNode head1, LinkedListNode head2) {
        // TODO: Write - Your - Code

        int lenH1 = getLength(head1);
        int lenH2 = getLength(head2);
        int gap = Math.abs(lenH1 - lenH2);
        // detrmine long and short track
        LinkedListNode longList, shortList;
        if (lenH1 >= lenH2) {
            longList = head1;
            shortList = head2;
        } else {
            longList = head2;
            shortList = head1;
        }
        // move to the same starting point
        while (gap > 0) {
            longList = longList.next;
            gap--;
        }

        // compair intersection address of node
        while (longList != null && shortList != null) {
            if (longList == shortList) {
                shortList.next = null;
                return shortList;
            }
            longList = longList.next;
            shortList = shortList.next;
        }

        return null;
    }

    public static int getLength(LinkedListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
