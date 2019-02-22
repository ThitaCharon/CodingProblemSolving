class reverseK{
    static LinkedListNode reverse_k_nodes( LinkedListNode head, int k) {
      //TODO: Write - Your - Code
      int size = getSize(head);
      if(k<=1 || k>= size){
        return head;}
      LinkedListNode reverse = null;
      LinkedListNode perv_tail = null;
      
      while(head != null){
        LinkedListNode cur_head = null;
        LinkedListNode cur_tail = head;
         System.out.println("head is" + head.data );
        int n = k;
        while(head != null && n>0){
          LinkedListNode listAfterhead = head.next;  //keep the rest of the node
          head.next = cur_head;          // each time get head node add to the head (ie 1->null, 2->1->null)
          cur_head = head;          // 1st iteration current point to 1->null 2nd 2->1->null 
          head = listAfterhead;   // remove one head node once at a time
          n--;                    // n sequence node will be reverse 
        }
  
        if(reverse == null){
          reverse = cur_head;
        }
        if(perv_tail != null){
          perv_tail.next = cur_head;
        }
        
        perv_tail = cur_tail;
        System.out.println(perv_tail.data);
      }
      
      return reverse;
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