package com.company.lesson8;

public class MatrixTest {
    public static void main(String[] args) {
        int[][] i = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
        int[][] j = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};

        Matrix matrix1 = new Matrix(i);
        Matrix matrix2 = new Matrix(j);
        Matrix matrix = new Matrix();

        matrix = matrix2.plus(matrix1);
        matrix2.print();
        matrix1.print();
        matrix.print();
        matrix2.multiplication(3);
        matrix1.print();
        matrix2.print();
        matrix.print();
    }
}
