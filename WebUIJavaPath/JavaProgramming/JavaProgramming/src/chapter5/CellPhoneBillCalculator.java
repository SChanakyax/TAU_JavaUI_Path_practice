package chapter5;

import java.util.Scanner;

public class CellPhoneBillCalculator {

    static double planCost;
    static int overageMinutes;


    public static void main(String[] args) {

        //user input plan fee, overage minutes
        System.out.println("Enter base cost of the plan : ");
        Scanner scanner = new Scanner(System.in);
        planCost = scanner.nextDouble();

        System.out.println("Enter overage minutes");
        overageMinutes = scanner.nextInt();

        //cal overage fee
        double overageFee = calculateOverageFee(overageMinutes);



        //cal tax
        double Tax = calculateTax(planCost,overageFee);

        //subtotal
        double subTotal = calculateSubTotal(planCost,overageFee, Tax);

        //Output
        System.out.println("Phone Bill Statement ");
        printBill(planCost,Tax,overageFee,subTotal);

    }

    private static void printBill(double plan, double tax, double overage, double total) {
        System.out.println("Plan: $" + plan +
                "Overage: $" + overage +
                "Tax: $"+tax+
                "Total: $" + total);
    }

    private static double calculateSubTotal(double plan, double overage, double tax) {
        double subTotal = plan + overage + tax;
        return subTotal;
    }

    private static double calculateOverageFee(int overMins) {
        double charge = (double) overMins * 0.25;
        return charge;
    }

    private static double calculateTax(double planCost, double overAgeFee) {
        double tax = (planCost + overAgeFee) * 0.15;
        return tax;
    }



}
