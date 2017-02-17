package edu.tomer.java;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // instantiate a student:
        Student moshe = new Student(
                "Moshe", "Doe", "03030405055",
                "Moshe@gmail.com", "050-7123012", "Mesharerim 4"
        );

        moshe.print();

        Student s = new Student();
        s.print();

       // moshe.print();



    }
}
