package com.company.lesson8;

public class MatrixTest {
    public static void main(String[] args) {
        int[][] i = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};

        Matrix matrix1 = new Matrix(i);

        matrix1.plus(matrix1);
        matrix1.print();
        matrix1.multiplication(matrix1, 2);
        matrix1.print();
    }
}
