package chapter11;

public class ShapeTester {

    public static void main(String[] args) {

        //Shape re = new Shape(); camot be instantiated

        Shape rectangle = new Rectangle(5,8);
        rectangle.print();

        System.out.println(rectangle.calculateArea());



    }
}
