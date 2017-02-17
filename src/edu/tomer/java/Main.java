package edu.tomer.java;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        StudentPhoneBook book = new StudentPhoneBook();


        // instantiate a student:
        Student moshe = new Student(
                "Moshe", "Doe", "03030405055",
                "Moshe@gmail.com", "050-7123012", "Mesharerim 4"
        );

        //this is a list of students:
        //init the list:
        ArrayList<Student> studentList = new ArrayList<>();

        //add an item to the list:
        studentList.add(moshe);
        studentList.add(new Student());

        //get an item from the list:
        //get an item by index:
        studentList.get(0);

        //whats the size of the list:
        int listSize = studentList.size();
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            s.print();
        }

        //remove an item from the list:
        //remove by index:
        studentList.remove(1);
        //remove a specific object:
        studentList.remove(moshe);

    }
}
