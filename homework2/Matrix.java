package hus.oop.homework2;

public class Matrix {
    // Exercise 4.2 Matrices (2D Arrays)

    public static void main(String[] args) {
        testMatrixOperations();
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrices must have the same dimensions for addition.");
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrices must have the same dimensions for addition.");
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrices must have the same dimensions for subtraction.");
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrices must have the same dimensions for subtraction.");
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println(
                    "Number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.");
        }
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println(
                    "Number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.");
        }
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void testMatrixOperations() {
        // Matrices
        int[][] intMatrix1 = { { 1, 2 }, { 3, 4 } };
        int[][] intMatrix2 = { { 5, 6 }, { 7, 8 } };
        double[][] doubleMatrix1 = { { 1.1, 2.2 }, { 3.3, 4.4 } };
        double[][] doubleMatrix2 = { { 5.5, 6.6 }, { 7.7, 8.8 } };

        // Test addition
        System.out.println("Integer Matrix Addition:");
        print(add(intMatrix1, intMatrix2));
        System.out.println("Double Matrix Addition:");
        print(add(doubleMatrix1, doubleMatrix2));

        // Test subtraction
        System.out.println("Integer Matrix Subtraction:");
        print(subtract(intMatrix1, intMatrix2));
        System.out.println("Double Matrix Subtraction:");
        print(subtract(doubleMatrix1, doubleMatrix2));

        // Test multiplication
        System.out.println("Integer Matrix Multiplication:");
        print(multiply(intMatrix1, intMatrix2));
        System.out.println("Double Matrix Multiplication:");
        print(multiply(doubleMatrix1, doubleMatrix2));
    }
}