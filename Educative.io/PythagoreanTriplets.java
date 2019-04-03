class pythagoreanTriplet{
    static List<int[]> find_pythagorean_triplets(int[] arr) {
      //TODO: Write - Your - Code
      Arrays.sort(arr);
      System.out.print(arr[0]);
      List<int[]> triplets = new ArrayList<int[]>();
      
      for (int i=0; i<arr.length-2; i++){
        int k = arr.length-1;
        
        for(int j = i+1; j<arr.length-1; j++){
          int sum = (arr[i]*arr[i]) + (arr[j]*arr[j]) - (arr[k]*arr[k]);
          System.out.println("k is : " + arr[k]);
          
          while(sum < 0){
            k--;
            sum = (arr[i]*arr[i]) + (arr[j]*arr[j]) - (arr[k]*arr[k]);
            System.out.println("negative k is " + arr[k]);
          }
          
          if (sum == 0){
            System.out.println("found triplet");
            int[] triplet = {arr[i], arr[j], arr[k]};
            triplets.add(triplet);
            break;
          }else if(sum > 0) {
            System.out.println("positive j is " + arr[j] + ", k is " +arr[k] ); 
            k = arr.length-1;
          }
        }
        
      }
      
      return triplets;
    }
  }  