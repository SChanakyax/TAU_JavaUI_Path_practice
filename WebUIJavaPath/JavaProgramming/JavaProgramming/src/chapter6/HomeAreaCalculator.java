package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        /**
         * RECTANGLE 1
         */
        Rectangle obj1 = new Rectangle();

        obj1.setWidth(12);
        obj1.setLength(12);

        //calculate the area
        double areaOfObj1 = obj1.calculateArea();

        //create instance of a class Rectangle
        Rectangle room2 = new Rectangle(10, 10);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfObj1 + areaOfRoom2;

        System.out.println(totalArea);

    }
}
