class reverseEven {
    public static LinkedListNode reverse_even_nodes(LinkedListNode head) {
        // TODO: Write - Your - Code
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode current = head;
        LinkedListNode evenHead = null;

        while (current != null && current.next != null) {
            LinkedListNode evenNode = current.next;
            current.next = evenNode.next;
            // Push at the head of new list.
            evenNode.next = evenHead;
            evenHead = evenNode;
            current = current.next;
        }

        LinkedListNode i = evenHead;
        System.out.print("Even");
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        i = head;
        System.out.println("Odd");
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }

        return mergeReverseEven(head, evenHead);
    }

    public static LinkedListNode mergeReverseEven(LinkedListNode odd, LinkedListNode even) {
        if (odd == null) {
            return even;
        }
        if (even == null) {
            return odd;
        }

        LinkedListNode newHead = odd;

        while (odd != null && even != null) {
            LinkedListNode temp = even;
            // System.out.print(odd.data + "->");
            even = even.next;
            temp.next = odd.next;
            odd.next = temp;
            odd = temp.next;
            // System.out.print(odd.data + "->");
        }
        return newHead;
    }
}