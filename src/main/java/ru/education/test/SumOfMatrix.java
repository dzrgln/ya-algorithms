package ru.education.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <a href="https://new.contest.yandex.ru/42492/problem?id=6789665/2023_04_06/xWOwt1Aj4A">Условие</a>
 */
public class SumOfMatrix {
    static void sumOfMatrix(int n, int m, int[][] a, int[][] b) {
        int[][] res = new int[n][m];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrix(res);
    }

    private static void printMatrix(int[][] a) {
        for (int[] ints : a) {
            StringBuilder sb = new StringBuilder();
            for (int anInt : ints) {
                sb.append(anInt);
                sb.append(" ");
            }
            String res = sb.toString().trim();
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line1 = br.readLine();

            int n = Integer.parseInt(line1.split(" ")[0]);
            int m = Integer.parseInt(line1.split(" ")[1]);


            int[][] a = readMatrixFromFile(br, n, m);
            int[][] b = readMatrixFromFile(br, n, m);

            sumOfMatrix(n, m, a, b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[][] readMatrixFromFile(BufferedReader br, int n, int m) throws IOException {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
        }
        return a;
    }
}