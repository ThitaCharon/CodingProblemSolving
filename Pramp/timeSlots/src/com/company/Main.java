package com.company;

public class Main {

    public static void main(String[] args) {

        int [][] slotA = {{0,10},{20,30},{60,70},{80,100}};
        int [][] slotB = {{11,15}, {25,45}, {50,100}};
        int [][] time =  timeSlots(slotA,slotB,20);
        System.out.println("{" + time[0][0] +"," + time[0][1] + "}");
    }

    private static int [][] timeSlots(int[][] A, int[][] B, int dur){
        int[][] slot = {{-1,-1}};
        int rowA =0, rowB = 0, colA=0, colB=0;
        int k = 0;

        while(rowA < A.length && rowB< B.length){

            while(!isInduration(A,rowA,dur) || A[rowA][1] < B[rowB][0]){
                rowA++;
            }
            while(!isInduration(B,rowB,dur) || B[rowB][1] < A[rowA][0]){
                rowB++;
            }

            if(isInduration(A,rowA,dur) && isInduration(B,rowB,dur)) {
                System.out.println("A {" + A[rowA][0] + "." + A[rowA][1] + "}");
                System.out.println("B {" + B[rowB][0] + "." + B[rowB][1] + "}");
                int b0 = B[rowB][0];
                int b1 = B[rowB][1];
                int a0 = A[rowA][0];
                int a1 = A[rowA][1];

                if (b0 + dur > a1) {
                    rowA++;
                } else if (a0 + dur > b0) {
                    rowB++;
                }
                if (b0 >= a0 && b0 + dur <= a1 && b0 + dur <= b1) {
                    System.out.println("dkdk");
                    int[][] ans = {{b0, b0 + dur}};
                    return ans;
                } else if (a0 >= b0 && a0 + dur <= a1 && a0 + dur <= b1) {
                    int[][] ans = {{a0, a0 + dur}};
                    return ans;
                }
            }
        }
        return slot ;
    }

    private static boolean isInduration(int[][] slot,int row, int dur){
        int time = slot[row][1] - slot[row][0];
        return time >= dur;
    }
}
