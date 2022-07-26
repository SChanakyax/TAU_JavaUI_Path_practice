package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static double salary;
    static double creditScore;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //know
        double s = getSalary();
        double c  = getCreditScore();
        scanner.close();

        //notify
        boolean qualified = isUserQualified(s , c);

        notifyUser(qualified);
    }

     static double getSalary(){
        System.out.println("Enter salary : ");
        salary = scanner.nextDouble();
        return salary;
    }

    public static double getCreditScore(){
        System.out.println("Enter credit Score : ");
        creditScore = scanner.nextDouble();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, double credit){
        if(salary >= 25000 && credit>=700){
            return true;
        }else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified) {
        if (isQualified)
            System.out.println("You have been approved");
        else
            System.out.println("Not Qualified");
    }


}
