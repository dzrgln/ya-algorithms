package ru.education.yandex.multiplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxMultiplicationOfTwoDigits {

    static long maxMultiplicationOfTwoDigits(int n, int[] a) {
        int max = -1;
        int preMax = -1;
        for (int i : a) {
            if (i > max) {
                preMax = max;
                max = i;
                continue;
            }
            if (i > preMax) {
                preMax = i;
            }
        }
        return ((long) max * preMax);
    }

    static int simpleApproach(int n, int[] a){
        int res = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i != j){
                    if(a[i] * a[j] > res) res = a[i] * a[j];
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
            System.out.println(maxMultiplicationOfTwoDigits(n ,a));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}