
/**********************************************************************************
 * Interview Question 1.7
 * 
 * Implement an algorithm rotate the matrix
 *********************************************************************************/

public class lesson1_q7 {
    public static void main(String[] args) {
        Integer[][] matrix = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
                { 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 } };

        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
        rotateRight(matrix);
        System.out.println("\nMatrix RoateRight :");
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
    }

    public static void rotateRight(Integer[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer; // pivot to target element
            int last = n - 1 - layer; // last index positon
            for (int pivot = first; pivot < last; pivot++) {
                int offset = pivot - first;
                int top = matrix[first][pivot]; // top conner for each layer
                // System.out.println("Top is: " + offset);
                matrix[first][pivot] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[pivot][last];
                matrix[pivot][last] = top;
            }
        }
    }
}
