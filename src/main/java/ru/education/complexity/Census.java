package ru.education.complexity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <a href="https://acmp.ru/index.asp?main=task&id_task=131">Условие</a>
 *  * Время работы O(n)
 *  * Сложность по памяти О(n)
 */
public class Census {
    public static void main(String[] args) throws FileNotFoundException {

        Resident[] residents = parseInputFile();
        Resident oldestMen = new Resident(0, 1);
        int res = -2;
        for (int i = 0; i < residents.length; i++) {
            Resident resident = residents[i];
            if (resident.gender == 1 && resident.age > oldestMen.age) {
                oldestMen = resident;
                res = i;
            }
        }

        PrintWriter pw = new PrintWriter("output.txt");
        pw.print(res + 1);
        pw.close();

    }

    private static Resident[] parseInputFile() {
        Scanner in = null;
        try {
            in = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = in.nextInt();

        Resident[] res = new Resident[n];
        for (int i = 0; i < n; i++) {
            res[i] = new Resident(in.nextInt(), in.nextInt());
        }
        return res;
    }

    private static class Resident {

        public Resident(int age, int gender) {
            this.age = age;
            this.gender = gender;
        }

        int age;
        int gender;
    }
}
