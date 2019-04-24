package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr = new int[] {2,-7, 8,-2,-2,0,1};
        for(int i: arr){
            System.out.print(i + ",");
        }
        System.out.println();
        absSort(arr);


        for(int i: arr){
            System.out.print(i + ",");
        }
    }
    static int[] absSort(int[] arr) {
        // your code goes here

        for (int lastUnsorted = arr.length-1; lastUnsorted >0; lastUnsorted--){

            int largestIndex = 0;
            //find largest index
            for(int i = 1; i <= lastUnsorted; i++){

                if(Math.abs(arr[i]) > Math.abs(arr[largestIndex])){
                    largestIndex = i;
                }
                if(Math.abs(arr[i])== Math.abs(arr[largestIndex])){
                    if(arr[i] >= arr[largestIndex]){
                        largestIndex = i;
                    }
                }
            }
            swap(arr, lastUnsorted, largestIndex);
        }
        return arr;
    }

    static void swap (int [] arr, int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

}
