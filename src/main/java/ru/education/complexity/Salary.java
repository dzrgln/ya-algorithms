package ru.education.complexity;

import java.io.*;
import java.util.Scanner;

/**
 * <a href="https://acmp.ru/index.asp?main=task&id_task=21">Условие</a>
 * Время работы O(n)
 * Сложность по памяти О(n)
 */
public class Salary {
    public static void main(String[] args) {
        int[] ints = parseInput();
        int max = -1;
        int min = 100000;
        for (int i : ints) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(max - min);
        out.flush();
    }

    private static int[] parseInput() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputArray = input.split(" ");
        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }
        return array;
    }
}
