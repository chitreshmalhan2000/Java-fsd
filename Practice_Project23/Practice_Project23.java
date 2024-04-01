package Practice_Project23;
import java.util.*;
public class Practice_Project23 {
	 public static void main(String[] args) {
	        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	        System.out.println("First Matrix:");
	        for (int[] row : matrix1) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    
	      
     System.out.println("Second Matrix:");
     for (int[] row : matrix2) {
         for (int num : row) {
             System.out.print(num + " ");
         }
         System.out.println();
     }
 

	        int[][] result = multiplyMatrices(matrix1, matrix2);

	        
	        System.out.println("Resultant (Multiplication) Matrix:");
	        for (int[] row : result) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }

	    static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
	        int row1 = mat1.length;
	        int col1 = mat1[0].length;
	        int col2 = mat2[0].length;

	        int[][] result = new int[row1][col2];

	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < col2; j++) {
	                for (int k = 0; k < col1; k++) {
	                    result[i][j] += mat1[i][k] * mat2[k][j];
	                }
	            }
	        }
	        return result;
	    }
	}
