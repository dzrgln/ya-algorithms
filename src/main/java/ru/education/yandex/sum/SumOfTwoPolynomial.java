package ru.education.yandex.sum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * <a href="https://new.contest.yandex.ru/42492/problem?id=215/2022_11_08/r1Y2AFKOd5">Условие</a>
 * */
public class SumOfTwoPolynomial {
    static void sumOfTwoPolynomial(int n, int[] a, int m, int[] b) {
        if (n >= m) {
            System.out.println(n);
            int dif = n - m;
            for (int i = dif; i < a.length; i++) {
                a[i] = a[i] + b[i - dif];
            }
            System.out.println(printArray(a));
        } else {
            System.out.println(m);
            int dif = m - n;
            for (int i = dif; i < b.length; i++) {
                b[i] = b[i] + a[i - dif];
            }
            System.out.println(printArray(b));
        }
    }

    private static String printArray(int[] array){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            res.append(array[i]).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            String line4 = br.readLine();

            int n = Integer.parseInt(line1);
            int m = Integer.parseInt(line3);

            String[] as = line2.split(" ");
            String[] bs = line4.split(" ");

            int[] a = new int[as.length];
            int[] b = new int[bs.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(as[i]);
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(bs[i]);
            }

            sumOfTwoPolynomial(n, a, m, b);
        }
    }
}
