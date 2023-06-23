package ru.education.multiplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxMultiplicationOfThreeDigits {

    static long maxMultiplicationOfThreeDigits(int n, int[] a) {
        Arrays.sort(a);
        long res1 = (long) a[n - 1] * a[n - 2] * a[n - 3];
        long res2 = (long) a[n - 1] * a[0] * a[1];
        return Math.max(res1, res2);
    }

    static Map<Long, int[]> data = new HashMap<>();

    static long simpleApproach(int n, int[] a) {
        long res = -90000000000000000L;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (i != j && j != k && i != k) {
                        if ((long) a[i] * a[j] * a[k] > res) {
                            res = (long) a[i] * a[j] * a[k];
                            data.clear();
                            data.put(res, new int[]{a[i], a[j], a[k]});
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line1 = br.readLine();
            String line2 = br.readLine();

            int n = Integer.parseInt(line1);

            String[] as = line2.split(" ");

            int[] a = new int[as.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(as[i]);
            }
            System.out.println(maxMultiplicationOfThreeDigits(n, a));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}