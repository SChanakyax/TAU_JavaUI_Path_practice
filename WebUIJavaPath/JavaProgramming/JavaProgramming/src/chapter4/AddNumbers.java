package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
//loop continues to run while the specified condition remains true
        //condition tested after completing the loop run at least once
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter no 1 :");
            double no1 = scanner.nextDouble();

            System.out.println("Enter no 2 : ");
            double no2 = scanner.nextDouble();

            double sum = no2 + no1;

            System.out.println("The sum is : " + sum);

            //update the sentinal
            System.out.println("Would u like to run again true/false ? ");
            again = scanner.nextBoolean();

        }while (again);

        scanner.close();
    }
}
