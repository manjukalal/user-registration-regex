package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner scanner = new Scanner(System.in);
    public void firstName() {
        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", firstName);
        if (answer) {
            System.out.println(firstName);
            System.out.println(answer);
        } else {
            System.out.println("please enter valid first name ");

            firstName();
        }
    }
}
