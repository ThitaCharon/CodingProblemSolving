import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class lesson2_q1 {
    public static void main(String[] args) {
        System.out.println("Delete duplicate node");
        // Node n = new Node();
        // System.out.println(n.getData());s
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println("Size is: " + list.size());
//        deleteDuplicate(list);
        System.out.println("Size is: " + list.size());

    }
    public class LinkedList {
        private static class LinkedListNode     {
          private int data;
          private LinkedListNode next;
      
          public LinkedListNode(int value) {
              this.data = value;
          }
      }
      
          private LinkedListNode head = null, tail = null;
      
          public insert(int value) {
              if (this.head == null) {
      
              }
          }
      }

}