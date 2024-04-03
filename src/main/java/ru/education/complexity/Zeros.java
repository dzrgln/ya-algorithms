package ru.education.complexity;

import java.util.Scanner;

/**
 * <a href="https://acmp.ru/index.asp?main=task&id_task=43">Условие</a>
 *  * Время работы O(n)
 *  * Сложность по памяти О(n)
 */
public class Zeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = 0;
        int buf = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                buf++;
            } else {
                if (buf > res) res = buf;
                buf = 0;
            }
        }
        if (buf > res) res = buf;
        System.out.println(res);
    }
}
