package ru.education.multiplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MaxMultiplicationOfFourDigits {

    static long maxMultiplicationOfFourDigits(int n, int[] a) {
        Arrays.sort(a);
        int[] b = new int[]{a[0], a[1], a[2], a[3], a[n-5], a[n-4],a[n-3],a[n-2],a[n-1]};
        return simpleApproach(8, b);
    }

    static long findMultiplicationOfThreeDigits(int n, int[] a){
        long res = -90000000000000000L;
        return res;
    }

    static long findMultiplicationOfTwoDigits(int n, int[] a){
        long res1 = a[n-1] * a[n];
        long res2 = a[1] * a[n];
        long res3 = a[0] * a[n];
        long res4 = a[1] * a[n-1];
        long res5 = a[0] * a[n-1];
        long res6 = a[0] * a[1];
        
        return res;
    }

    static Map<Long, int[]> data = new HashMap<>();

    static long simpleApproach(int n, int[] a) {
        long res = -90000000000000000L;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        List<Integer> inList = List.of(i, j, k, l);
                        Set<Integer> indexes = new HashSet<>(inList);
                        if (indexes.size() == 4) {
                            if ((long) a[i] * a[j] * a[k] * a[l]> res) {
                                res = (long) a[i] * a[j] * a[k] * a[l];
                                data.clear();
                                data.put(res, new int[]{a[i], a[j], a[k]});
                            }
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
            System.out.println(maxMultiplicationOfFourDigits(n, a));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
