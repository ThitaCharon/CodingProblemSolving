class removeDuplicate {
    public static LinkedListNode remove_duplicates(LinkedListNode head) {
        // TODO: Write - Your - Code
        if (head == null || head.next == null) {
            return head;
        }
        HashSet<Integer> hash = new HashSet<Integer>();
        LinkedListNode current = head;
        hash.add(current.data);

        while (current.next != null) {
            if (!hash.contains(current.next.data)) {
                hash.add(current.data);
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
        return head;
    }
}