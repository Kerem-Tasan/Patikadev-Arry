public class transpoze {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matrix\t:");
        printArr(matrix);
        System.out.println("Transpoze");
        Change(matrix);


    }

    static void Change(int matrix[][]) {
        int[][] Transpoze = new int[matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                Transpoze[col][rows] = matrix[rows][col];
            }
        }
        printArr(Transpoze);

    }


    static void printArr(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }


}