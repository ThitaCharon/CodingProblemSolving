class mergeSort {
    public static LinkedListNode merge_sort(LinkedListNode head) {
        // TODO: Write - Your - Code
        if (head == null || head.next == null) {
            return head;
        }
        Pair<LinkedListNode, LinkedListNode> split = new Pair<LinkedListNode, LinkedListNode>(null, null);
        splitList(head, split);
        split.first = merge_sort(split.first);
        split.second = merge_sort(split.second);

        return mergeList(split.first, split.second);
    }

    public static LinkedListNode mergeList(LinkedListNode first, LinkedListNode second) {

        if (first == null) {
            return second;
        } else if (second == null) {
            return first;
        }

        LinkedListNode sortedHead = null;
        if (first.data <= second.data) {
            sortedHead = first;
            first = first.next;
        } else if (first.data > second.data) {
            sortedHead = second;
            second = second.next;
        }

        LinkedListNode cur = sortedHead;
        while (first != null & second != null) {
            LinkedListNode node = null;
            if (first.data <= second.data) {
                node = first;
                first = first.next;
            } else {
                node = second;
                second = second.next;
            }
            cur.next = node;
            cur = cur.next;
        }

        if (first != null) {
            cur.next = first;
        } else {
            cur.next = second;
        }
        // print sortedHead
        LinkedListNode e = sortedHead;
        System.out.println("sortedHead");
        while (e != null) {
            System.out.print(e.data + "->");
            e = e.next;
        }

        return sortedHead;
    }

    public static void splitList(LinkedListNode head, Pair<LinkedListNode, LinkedListNode> split) {

        if (head == null) {
            return;
        }
        // if only one node
        if (head.next == null) {
            split.first = head;
            split.second = null;
        } else {
            LinkedListNode pointer = head;
            LinkedListNode runner = head.next;

            // find the mid point
            while (runner != null) {
                runner = runner.next;
                if (runner != null) {
                    runner = runner.next;
                    pointer = pointer.next;
                }

            }
            // split head to mid and mid+1 to tail
            LinkedListNode mid = pointer;
            split.first = head;
            split.second = mid.next;
            mid.next = null;
        }

        // Debuging display LinkedList
        LinkedListNode cur = split.first;
        System.out.println("");
        System.out.print("1st : ");
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        cur = split.second;
        System.out.println("");
        System.out.print("2nd : ");
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
    }
}