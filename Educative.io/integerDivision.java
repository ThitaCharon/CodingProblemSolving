class divideInteger{
    public static int integer_divide(int x, int y) {
      //TODO: Write - Your - Code
      if ( y==0) return -1;
      
      if (x<y) return 0;
      else if (y==1) return x;
      else if (y==x) return 1;
      int q = 1;
      int val = y;
    
      while (val < x) {
        val = val + val;
        // we can also use 'val = val + val;'
        q = q + q;
        // we can also use 'q = q + q;'
      }
    
      if (val > x) {
        val = val/2;
        q = q/2;
      
        return q + integer_divide(x - val, y);
      }
    
      return q;
      
    }
  }  