package com.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("exercise4.txt"));
        List<String> lines = new ArrayList<String>();

        String read = reader.readLine();
        while (read != null) {
            lines.add(read);
            read = reader.readLine();
        }
        reader.close();

        System.out.println("Count of names: " + lines.size());
        for (String i : lines) {
            System.out.println("Name: " + i);
        }
    }
}
