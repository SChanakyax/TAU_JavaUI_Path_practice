package chapter9;

import javax.sound.sampled.ReverbType;

public class InheritanceTester {

    public static void main(String[] args) {
        //Person person = new Person();

        //Person  constructor will call first
        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();
        square.print("ggg");

        Mother mom = new Mother();
        mom.setName("XXX");

        System.out.println(mom.getGender() + mom.getName());

    }


}
