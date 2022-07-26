package chapter8;

public class ConvertDecimalToInt {

    public static void main(String[] args) {
        double[] numbers = { 1.3, 3.4, 4.5};

        for(Double number : numbers){
            System.out.println(number.intValue());//To make double to whole numbers
        }
    }


}
