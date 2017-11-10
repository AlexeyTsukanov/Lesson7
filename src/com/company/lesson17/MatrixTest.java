package com.company.lesson17;

import java.util.Arrays;

public class MatrixTest {
    public static void main(String[] args) {
        Integer[][] int1 = {{1, 2}, {3, 4}};
        Matrix<Integer> matrix1 = new Matrix<>(int1);
        Matrix<Integer> matrix2 = new Matrix<>(int1);
        Matrix<Integer> matrix3 = matrix1.plus(matrix2);
        Matrix<Integer> matrix4 = matrix1.multiplication(2);

        matrix3.print();
        matrix4.print();
        matrix1.print();
        matrix2.print();

    }

    public static class Matrix<T extends Number> {
        private T[][] array;
        private int leng;
        private int height;

        Matrix(T[][] array) {
            this.array = array;
            leng = array.length;
            height = array[0].length;
        }

        Matrix() {
        }

        Matrix plus(Matrix matrix) {
            Integer[][] newArray = new Integer[leng][height];
            Matrix newMatrix = new Matrix(newArray);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++)
                    newMatrix.array[i][j] = matrix.array[i][j].intValue() + array[i][j].intValue();
            }
            return newMatrix;
        }

        public Integer[][] getArray() {
            return (Integer[][]) array;
        }

        Matrix multiplication(T a) {
            Integer[][] newArray = new Integer[leng][height];
            Matrix newMatrix = new Matrix(newArray);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++)
                    newMatrix.array[i][j] = array[i][j].intValue() * a.intValue();
            }
            return newMatrix;
        }

        void print() {
            System.out.println(Arrays.deepToString(array));
        }
    }
}
