package com.company;

public class Main {

    public static void main(String[] args) {

	    int [] arr = {20,35,-15,7,55,1,-22};
	    System.out.println(arr.length);
        printArray(arr);
        mergeSort(arr, 0 , arr.length-1);
        printArray(arr);
    }
    public static void mergeSort(int [] a , int start, int end){

        if(start < end){
            int mid = (end + start)/2;
            mergeSort(a , start, mid);
            mergeSort(a , mid+1 , end);
            merge(a, start , mid, end);
            printArray(a);
        }
    }

    //20,35,-15,7,55  ,1,-22
    // 0, 1,  2,3, 4  ,5,  6
    // s, 1,  2,m, m+1,6,  e
    public static void merge( int [] arr , int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int [] L = new int [n1];
        int [] R = new int [n2];
        System.out.println("Start ;"  + start + " ,mid ; " + mid + " end ; " + end);

        for(int i = 0 ; i<n1 ; i++){
            L[i] = arr[start + i];
        }
       // R[mid] = infinity;
        for(int j = 0 ; j<n2 ; j++){
            R[j] = arr[mid + 1 + j];
        }
        int i =0, j=0;
        int k = start;

        while (i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1){
            arr[k++] = L[i++];
        }
        while (j<n2){
            arr[k++] = R[j++];
        }

    }

    public static void printArray(int [] arr){
        for(int i = 0 ; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
