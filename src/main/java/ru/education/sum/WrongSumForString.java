package ru.education.sum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * <a href="https://new.contest.yandex.ru/42492/problem?id=6789665/2023_04_06/GWcZqPTpiJ">Условие</a>
 * */
public class WrongSumForString {
    static void wrongSumForString(int n, String a, String b){
        StringBuilder sb = new StringBuilder();
        if(n == a.length() && n == b.length()){
            for (int i = 0; i < n; i++) {
                sb.append(a.toCharArray()[i]);
                sb.append(b.toCharArray()[i]);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();

            int n = Integer.parseInt(line1);

            wrongSumForString(n, line2, line3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
