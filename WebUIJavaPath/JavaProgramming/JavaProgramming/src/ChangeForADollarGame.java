import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {
        //what we know
        int pennie = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int dollar = 100;
        int total = 0;
        int noOfDollars = 0;
        int remain =0;

        //user inputs
        int userPennies;
        int userNickels;
        int userDimes;
        int userQuarters;

        //what we need
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies would you like?");
        userPennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        userNickels = scanner.nextInt();

        System.out.println("How many dimes?");
        userDimes = scanner.nextInt();

        System.out.println("How many quarters?");
        userQuarters = scanner.nextInt();

        scanner.close();

        total = (userPennies*pennie) + (userNickels*nickel) + (userDimes*dime) + (userQuarters*quarter);

        if (total > dollar){
            noOfDollars = total / dollar;
            remain = total - (noOfDollars*100);

            System.out.println("You get $" + noOfDollars + "and " + remain + "cents as the exchange. But You are over the $1");
        } else if (total < dollar) {
            int dollarshort = total - dollar;
            System.out.println("You are " + dollarshort + "short to have a dollar");
        }else {
            System.out.println("You won $1");
        }


        //logic

    }




}
