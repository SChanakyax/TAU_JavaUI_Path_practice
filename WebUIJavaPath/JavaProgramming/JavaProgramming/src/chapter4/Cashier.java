package chapter4;

import java.util.Scanner;

public class Cashier {

    //best to use when you know how many times should run
    public static void main(String[] args) {

        //Get no og items to scan
        System.out.println("Enter the number of items you like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //create loop to iterate through all of the items and accumulate the costs
        //i is the sentinal value
        for(int i=0; i < quantity; i++){
            System.out.println("Enter the cost of a product");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your Total is : " + total);

    }
}
