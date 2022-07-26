package chapter8;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidatorMine {

    private static String userName;
    private static String oldPassword;
    private static String newPassword;

    static boolean isValidPassword = false;
    static String errorMessage;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Username : ");
        userName = scanner.nextLine();

        System.out.println("Enter Old Password : ");
        oldPassword = scanner.next();



        do {
            System.out.println("Enter New Password : ");
            newPassword = scanner.next();
           // isValidPWD(newPassword);
        }while (true);

    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    private static void isValidPWD(String newPassword) {

        System.out.println(newPassword);

        if(newPassword.length() < 8){
            isValidPassword =false;
            errorMessage = "\n Your password must be at least 8 characters.";
        }

        if(newPassword.matches("[a-zA-Z0-9]*")){
            isValidPassword = false;
            errorMessage = "\n Your password must include special characters.";
        }

        if (newPassword.equals(oldPassword)){
            isValidPassword = false;
            errorMessage = "\n Your password should not include old password";
        }


    }


}
