/**********************************************************************************
 * Interview Question 1.8
 * 
 * Implement an algorithm set to zero on the matrix MxN
 **********************************************************************************/

public class lesson1_q8 {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0 } };

        System.out.println("\nMatrix : M x N ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("");
        }

        setToZero(matrix);

        System.out.println("settoZero");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public static void setToZero(int[][] matrix) {

        boolean rowFlags = false;
        boolean colFlags = false;

        // set zeroflag for the 1st row has zero elements
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                rowFlags = true;
                break;
            }
        }
        // set zeroflag for the 1st column has zero element
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                colFlags = true;
                break;
            }
        }

        // chech all element in beside first row and column
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // check first row and first column contain zero element
        for (int col = 1; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < matrix.length; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < matrix[0].length; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // if 1st row or column contain zero element set all row or column to zero
        if (rowFlags == true) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }

        if (colFlags == true) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[0][col] = 0;
            }
        }
    }
}