package com.bridgelabz;

public class RegexMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName();
        userRegistration.validateLastName();
        userRegistration.validateEmail();
        userRegistration.validateContactNumber();
        userRegistration.validatePasswordEightDigit();
        userRegistration.validatePasswordOneUpperCase();
        userRegistration.validatePasswordOneNum();
        userRegistration.validatePasswordOneSpecialCharacter();
        userRegistration.emailValidation();
    }
}
