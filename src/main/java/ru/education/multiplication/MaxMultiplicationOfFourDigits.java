package ru.education.multiplication;

import ru.education.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMultiplicationOfFourDigits {

    static long maxMultiplicationOfFourDigits(int n, int[] a) {
        long res;
        if (n > 8) {
            Integer[] b = new Integer[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            Arrays.sort(b, Comparator.comparingInt(Math::abs));
            Utils.printArray(b);
            int[] c = new int[]{b[n - 8], b[n - 7], b[n - 6], b[n - 5], b[n - 4], b[n - 3], b[n - 2], b[n - 1]};
            res = simpleApproach(8, c);
        } else {
            res = simpleApproach(n, a);
        }
        return res;
    }

    static List<Integer> list = new ArrayList<>();

    static long simpleApproach(int n, int[] a) {
        long res = -90000000000000000L;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        boolean checkI = i != j && i != k && i != l;
                        boolean checkJ = j != k && j != l;
                        boolean checkK = k != l;
                        if (checkI && checkJ && checkK) {
                            if ((long) a[i] * a[j] * a[k] * a[l] > res) {
                                res = (long) a[i] * a[j] * a[k] * a[l];
                                list.clear();
                                list.add(a[i]);
                                list.add(a[j]);
                                list.add(a[k]);
                                list.add(a[l]);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int q = 0;
        while (q < 1000) {
            Utils.generateRow(4, 50, -1000, 1000);
            q++;
            try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
                String line1 = br.readLine();
                String line2 = br.readLine();

                int n = Integer.parseInt(line1);

                String[] as = line2.split(" ");

                int[] a = new int[as.length];

                for (int i = 0; i < a.length; i++) {
                    a[i] = Integer.parseInt(as[i]);
                }
                if (simpleApproach(n, a) == maxMultiplicationOfFourDigits(n, a)) {
                    System.out.println("ok");
                } else {
                    System.out.println("????????????????????????????????????????????????");
                    System.out.println(simpleApproach(n, a));
                    System.out.println(maxMultiplicationOfFourDigits(n, a));
                    System.out.println(list);
                    break;
                }
                //   System.out.println(maxMultiplicationOfFourDigits(n, a));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
