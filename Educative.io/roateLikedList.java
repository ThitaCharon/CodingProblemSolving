class rotateList{
    public static LinkedListNode rotate_list(LinkedListNode head, int n) {
      //TODO: Write - Your - Code
      if(head == null){
        return head;}
      int size = getSize(head);
      int stopAtNode = size - ((size + n) % size);
      int index = stopAtNode;
      System.out.println("size is " + size);
      LinkedListNode  current = head;
      
      while(stopAtNode > 1){
        stopAtNode--;
        current = current.next;
      }
      LinkedListNode new_Head = current.next;
      current.next = null;
      
      current = new_Head;
      while(current.next != null){
        current = current.next;
      }
      current.next = head;
      
      return new_Head;
   }
   public static int getSize(LinkedListNode head){
     int size = 0;
     while(head!=null){
       head = head.next;
       size++;
     }
     return size;
   }
 }  