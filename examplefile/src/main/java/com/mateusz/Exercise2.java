package com.mateusz;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String fileName = "exercise2.txt";

        System.out.print("How many names could you write to the file: ");
        final int arraySize = scanner.nextInt();

        String [] arrayOfNames = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Type name: ");
            arrayOfNames[i] = scanner.next();
        }

        PrintWriter printWriter = new PrintWriter(fileName);
        for (String name : arrayOfNames) {
            printWriter.write(name + "\n");
        }
        printWriter.close();
    }
}
