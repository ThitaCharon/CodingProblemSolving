import com.sun.javafx.scene.paint.GradientUtils.Point;

/**********************************************************************************
 * Interview Question 1.7
 * 
 * Implement an algorithm rotate the matrix 
 *********************************************************************************/

public class lesson1_q7 {
    public static void main(String[] args) {
        Integer[][] matrix = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
                { 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 } };

        System.out.println("\nMatrix :");
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
        rotateRight(matrix);
        System.out.println("\nRoateRight :");
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
        rotateLeft(matrix);
        System.out.println("\nRoateLeft :");
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
    }

    /*
     * rotateLeft method will rotate the matrix to the left this algorithm run
     * O(n^2) find how many layers work from out side to the core. In each layer
     * replace element by tracking direction and use offset helper
     */
    public static void rotateLeft(Integer[][] matrix) {
        for (int layer = 0; layer < matrix.length / 2; layer++) {
            int first = layer;
            int last = matrix.length - 1 - layer;
            for (int pivot = first; pivot < last; pivot++) {
                int offset = pivot - first;
                int top = matrix[first][pivot];
                // System.out.println("Top is: " +top);
                matrix[first][pivot] = matrix[first + offset][last];
                matrix[first + offset][last] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[last - offset][first];
                matrix[last - offset][first] = top;
            }
        }
    }

    public static void rotateRight(Integer[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int pivot = first; pivot < last; pivot++) {
                int offset = pivot - first;
                int top = matrix[first][pivot];
                matrix[first][pivot] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[pivot][last];
                matrix[pivot][last] = top;
            }
        }
    }

}
