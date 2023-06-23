package ru.education;

import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public static void printArray(int[] array) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            res.append(array[i]).append(" ");
        }
        System.out.println(res.toString().trim());
    }

    public static void generateRow(int n1, int n2, int a1, int a2){
        int n = (int) (Math.random() * (n2 - n1) + n1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = (int) (Math.random() * (a2 - a1) + a1);
            sb.append(a);
            sb.append(" ");
        }
        String res = sb.toString().trim();

        try(FileWriter writer = new FileWriter("input.txt", false))
        {
            writer.write(n + "");
            // запись по символам
            writer.append('\n');
            writer.append(res);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
