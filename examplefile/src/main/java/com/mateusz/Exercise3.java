package com.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new FileReader("exercise3.txt"));
        final int arraySize = Integer.parseInt(reader.readLine());
        int [] numbers = new int[arraySize];

        for (int i= 0; i < arraySize; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }

        System.out.print("Sum of numbers from file: " + sum);
    }
}
