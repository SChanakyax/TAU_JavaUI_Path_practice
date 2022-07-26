package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] day= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static void main(String[] args) {
        System.out.println("Enter no to display the day : ");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        scanner.close();

        System.out.println("Corresponding date : " + day[no-1]);

    }

}
