package com.mateusz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Thomas", "Keller"));
        students.add(new Student(2, "Martin", "Johnson"));
        students.add(new Student(3, "Lukas", "Taylor"));

        PrintWriter printWriter = new PrintWriter("exercise5.txt");
        for(Student student : students) {
            printWriter.write(student + "\n");
        }
        printWriter.close();
    }
}
