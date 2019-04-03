class findMissing{
    static int find_missing(List<Integer> input) {
      //TODO: Write - Your - Code
      // check error of input
      int n = input.size() + 1;
      int sum = (n*(n+1))/2;
      for (int i=0; i<input.size(); i++){
        sum -= input.get(i);
      }
      return sum;
    }
  }  