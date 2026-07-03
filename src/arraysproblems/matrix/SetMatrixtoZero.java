package arraysproblems.matrix;

import java.util.Arrays;

public class SetMatrixtoZero {

    static void main() {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    setRowZero(arr, i);
                    setColumnZero(arr, j);

                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }

    private static void setColumnZero(int[][] arr, int column) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][column] != -1) {
                arr[i][column] = -1;
            }

        }

    }

    private static void setRowZero(int[][] arr, int row) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i] != 0) {
                arr[row][i] = -1;

            }

        }

    }
}
