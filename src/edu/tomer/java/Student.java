package edu.tomer.java;

import java.util.Date;

/**
 * Created by Android2017 on 17/02/2017.
 */
public class Student {
    //properties:
    String firstName;
    String lastName;
    String socialID;
    Date enrollmentDate; //Shift + F6 (Rename
    String email;
    String phone;
    String address;

    //Constructor:
    // a special method that assists us in initializing all the properties:
    //alt + insert:
    public Student(String firstName, String lastName, String socialID, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.enrollmentDate = new Date();
    }

    //Actions / Methods:
    public void print(){
        System.out.println(toString());
    }

   public String toString() {
       return
                       "First Name: " + firstName + "\n" +
                       "Last Name: " + lastName + "\n" +
                       "Social ID: " + socialID + "\n" +
                       "Birth Date: " + enrollmentDate + "\n" +
                       "Email address: " + email + "\n" +
                       "Home Address: " + address + "\n" +
                       "Phone: " + phone;
   }

}