package com.training.string.a;

import static com.training.string.File.*;

public class VariantA {
    private static String folder = "src/com/training/string/a/";

    public static void main(String[] args) {
        System.out.println(readFile(folder + "THE PURSUIT OF HAPPINESS.txt"));
        String text = readFile(folder + "THE PURSUIT OF HAPPINESS.txt");

        /*Task #3: В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А вместо О.
        Внести исправления в текст*/
        String resultTask3 = text.replaceAll("\\*?[Р][А]", "РО");
        writeFile(folder + "result.txt", "Task #3(A):\n" + resultTask3, false);

        /*Task #8: Удалить из текста его часть, заключенную между двумя символами, которые вводятся
        (например между "(" и ")" или между звездочками "*" и т.п.)*/
        String resultTask8 = text.replaceAll("\\*?[(\\[|(|*|{].*?['\\]|)|*|}']", "");
        writeFile(folder + "result.txt", "Task #8(A):\n" + resultTask8, true);
    }
}
