package ru.education.sum;

import java.util.Scanner;

/**
 * <a href="https://new.contest.yandex.ru/42492/problem?id=215/2022_11_08/xe5ldZjyee">Условие</a>
 */
class SumOfTwoDigits {
    static int sumOfTwoDigits(int first_digit, int second_digit) {
        return first_digit + second_digit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sumOfTwoDigits(a, b));
    }
}