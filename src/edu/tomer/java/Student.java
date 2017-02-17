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
    Date birthDate;
    String email;
    String phone;
    String address;

    //Actions / Methods:
    void print(){
        System.out.println(
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName +"\n" +
                "Social ID: " + socialID +"\n"+
                "Birth Date: " + birthDate +"\n"+
                "Email address: " + email +"\n"+
                "Home Address: " + address +"\n"+
                "Phone: " + phone);
    }
}
