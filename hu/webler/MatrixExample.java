package hu.webler;

public class MatrixExample {

    public static void main(String[] args) {

        //egy dimenziós tömb

        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 100; // vagy nums[i] = i * 100;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\n---------------------");
        //két dimenziós tömb

        int[][] matrix = new int [5][5];

        for (int i = 0; 1 < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i+100) + (j + 100);

            }
        }
        // Mátrix kiíratása
        for (int[] numbers : matrix) {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }





    }
}
