package ru.education.complexity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * <a href="https://acmp.ru/index.asp?main=task&id_task=46">Условие</a>
 *  * Время работы O(1), т.к. у нас в принципе нету n-мерного массива на вход
 *  * Сложность по памяти О(1) аналогично
 */
public class E {
    private static final BigDecimal E = new BigDecimal("2.7182818284590452353602875");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigDecimal bigDecimal = E.setScale(n, RoundingMode.HALF_UP);
        System.out.println(bigDecimal);
    }
}
