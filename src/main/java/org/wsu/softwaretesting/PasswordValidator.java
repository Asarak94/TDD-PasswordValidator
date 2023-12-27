package org.wsu.softwaretesting;

public class PasswordValidator {

    public static String validatePassword(String password) {
        String output = "";
        while (true) {
            if (isValidPassword(password)) {
                if (checkPasswordStrenght(password)) {
                    System.out.println("Strong password");
                    output ="Strong password";
                } else {
                    System.out.println("Weak password");
                    output = "Weak password";
                }
                break;
            } else {
                System.out.println("Invalid Password!");
                output = "Invalid Password!";
                break;
            }
        }
        return output;
    }

    public static boolean isValidPassword(String password) {
        if ((password.length() < 12) || (!password.matches("[A-Za-z0-9~!@#$%^&*()-_+=\\[\\]{}\\|;:'\",<>/?]+"))) {
            return false;
        }
        return true;
    }

    public static boolean checkPasswordStrenght(String password) {
        int specialCharacterCount = password.replaceAll("[a-zA-Z0-9]", "").length();
        int alphabeticCharacters = password.replaceAll("[^a-zA-Z]", "").length();
        if ((password.length() < 14) || (!password.matches(".*[A-Z].*")) || (!password.matches(".*[a-z].*")) || (!password.matches(".*\\d.*")) || (specialCharacterCount < 2) || (alphabeticCharacters < 6)) {
            return false;
        }
        return true;
    }
}