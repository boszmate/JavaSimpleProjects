package com.mateusz;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String fileName = "exercise1.txt";

        System.out.print("How many numbers to write to the file: ");
        final int arraySize = scanner.nextInt();

        int [] numbers = new int [arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Type number: ");
            numbers[i] = scanner.nextInt();
        }

        PrintWriter printWriter = new PrintWriter(fileName);
        for (int number : numbers) {
            printWriter.write(number + "\n");
        }
        printWriter.close();
    }
}
