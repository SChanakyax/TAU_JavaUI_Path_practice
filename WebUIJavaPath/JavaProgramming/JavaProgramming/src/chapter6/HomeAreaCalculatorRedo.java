package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        // we can use objects as the arguments for methods, as well.
        Rectangle kitchen = calculator.getRoom();
//This method is not going to return a primitive
// data type. It's going to return the Rectangle object,
// because that's what we're expecting from getRoom(). We see that
// we don't have to limit our methods to the data types that
// it returns being primitive, nor the parameters that it accepts.
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println(area);
        calculator.scanner.close();
    }

    private static double calculateTotalArea(Rectangle kitchen, Rectangle bathroom) {
        return kitchen.calculateArea()+ bathroom.calculateArea();
    }

    public Rectangle getRoom(){


        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();



        /*
        Rectangle room = new Rectangle(length, width);
        return room;
        we don't use this instance any more so creating such is a waste
         */

        /*
        Static Non-Access Modifier

        Static is used for members of a class which can be accessed without using
        an instance of the class to do so. Because it’s not associated with an
        instantiation, these members have no state.
         */

        return new Rectangle(length, width);

    }
}
