class kth_permutation{
    static void find_kth_permutation(List<Character> v, int k, StringBuilder result) {
      int n = v.size();
      if(n < 1){ 
        return;}
      
      int selected = (k-1)/ factorial(n-1);
      result.append(v.get(selected));
      v.remove(selected);
      // update k
      k = k - (factorial(n-1) * selected);
      find_kth_permutation(v, k, result);   
    }
  
    static int factorial(int n){
      if( n==0 || n==1) 
          return 1;
      return n * factorial(n-1);
    }
  
  }  