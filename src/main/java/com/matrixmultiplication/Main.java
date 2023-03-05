package com.matrixmultiplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows of first matrix: ");
        int rowsOfFirstMatrix = scanner.nextInt();
        System.out.println("Enter number of column of first matrix: ");
        int colsOfFirstMatrix = scanner.nextInt();

        int[][] firstMatrix = new int[rowsOfFirstMatrix][colsOfFirstMatrix];

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < colsOfFirstMatrix; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter number of rows of second matrix: ");
        int rowsOfSecondMatrix = scanner.nextInt();
        System.out.println("Enter number of column of second matrix: ");
        int colsOfSecondMatrix = scanner.nextInt();

        int[][] secondMatrix = new int[rowsOfSecondMatrix][colsOfSecondMatrix];

        for (int i = 0; i < rowsOfSecondMatrix; i++) {
            for (int j = 0; j < colsOfSecondMatrix; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        int rowsOfResult = rowsOfFirstMatrix;
        int colsOfResult = colsOfSecondMatrix;

        int[][] result = new int[rowsOfResult][colsOfResult];
        if (colsOfFirstMatrix == rowsOfSecondMatrix) {
            for (int i = 0; i < rowsOfResult; i++) {
                for (int j = 0; j < colsOfResult; j++) {
                    for (int k = 0; k < colsOfFirstMatrix; k++) {
                        result[i][j] = result[i][j] + (firstMatrix[i][k] * secondMatrix[k][j]);
                    }
                }

            }
            for (int i = 0; i < rowsOfResult; i++) {
                for (int j = 0; j < colsOfSecondMatrix; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication is not possible");
        }
    }
}