class addIntegers{
    static LinkedListNode add_integers( LinkedListNode integer1, LinkedListNode integer2) {
        //TODO: Write - Your - Code
        //check error
        LinkedListNode sum_head = null;
        //int carry = (integer1.data + integer2.data)/10;
        int digit = (integer1.data + integer2.data)%10;
        LinkedListNode pNew = new LinkedListNode(digit);
        sum_head = pNew;
        pNew.next = null;
        pNew = sum_head;
      
        while(integer1.next != null && integer2.next != null){
          integer1 = integer1.next;
          integer2 = integer2.next;
          digit = (integer1.data + integer2.data)%10;
          LinkedListNode node = new LinkedListNode(digit);
          pNew.next = node;
          pNew = pNew.next;
          pNew.next = null;
        }
          
        if(integer1 != null){
            pNew.next = integer1;
         // System.out.println(pNew.data);
            integer1 = integer1.next;
        }
      
        if(integer2 != null){
            pNew.next = integer1;
         // System.out.println(pNew.data);
            integer1 = integer1.next;
          
        }
       
        return sum_head;
    }
  }  