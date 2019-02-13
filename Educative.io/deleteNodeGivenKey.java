class deleteNode {
    public static LinkedListNode delete_node(LinkedListNode head, int key) {
        // TODO: Write - Your - Code
        if (head == null) {
            return head;
        }

        LinkedListNode cur = head;
        LinkedListNode prev = null;
        while (cur != null) {
            if (cur.data == key) {
                System.out.println(cur.data + "==" + key);
                // found on head position
                if (cur == head) {
                    head = head.next;
                    cur = head;
                } else {
                    prev.next = cur.next;
                }
                cur = cur.next;
            } else {
                System.out.println(cur.data + "Not");
                prev = cur;
                cur = cur.next;
            }
        }

        return head;
    }
}