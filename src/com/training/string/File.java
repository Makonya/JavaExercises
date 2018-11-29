package com.training.string;

import java.io.*;
import java.util.Scanner;

public class File {
    public static String readFile(String filename){
        StringBuilder result = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            Scanner scanner = new Scanner(bufferedReader);
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
//    public static String readFile(String filename) {
//        StringBuilder result = new StringBuilder();
//        String line;
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
//            while ((line = bufferedReader.readLine()) != null) {
//                result.append(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return result.toString();
//    }

    public static void writeFile(String filename, String text, boolean append) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, append))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
