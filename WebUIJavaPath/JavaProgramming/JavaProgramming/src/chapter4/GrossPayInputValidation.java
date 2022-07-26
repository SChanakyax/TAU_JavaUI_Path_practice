package chapter4;

import java.util.Scanner;

/**
 * WHILE LOOP:
 * Each store employee make $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

    public static void main(String[] args) {

        //Initialize known variables
        int rate  = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week ?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Enter hours between 1- 40");
            //sentinal - loop will not infinitly
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println(gross);

    }
}
