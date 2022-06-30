package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner scanner = new Scanner(System.in);

    public void validateFirstName() {
        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", firstName);
        if (answer) {
            System.out.println(firstName);
            System.out.println(answer);
        } else {
            System.out.println("please enter valid first name ");
          validateFirstName();
        }
    }

    public void validateLastName() {
        scanner = new Scanner(System.in);
        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", lastName);
        if (answer) {
            System.out.println(lastName);
            System.out.println(answer);
        } else {
            System.out.println("please enter valid last name ");
            validateLastName();
        }

    }

    public void validateEmail() {
        scanner = new Scanner(System.in);
        System.out.print("Enter email ID : ");
        String email = scanner.next();
        Boolean answer = Pattern.matches("[a-zA-Z\\d]+[^_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z.-]+", email);
        if (answer) {
            System.out.println(email);
            System.out.println(answer);
        } else {
            System.out.println("please enter valid email ID ");
            validateEmail();
        }

    }

}
