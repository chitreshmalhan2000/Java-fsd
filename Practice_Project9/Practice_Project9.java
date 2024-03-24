package Practice_Project9;
public class Practice_Project9 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
             numbers[0]=5;
             numbers[1]=10;
             numbers[2]=15;
             numbers[3]=20;
             numbers[4]=25;

        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        numbers[2] = 30;

        System.out.println("\nArray after modification:");
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        System.out.println("\nNames of array elements:");
        for (String name : names) {
            System.out.println(name);
        }

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMulti-dimensional array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
