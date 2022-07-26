package chapter10.exercise;

public class Banana extends FruitMarket{

    public Banana(){
        setCalories(458);
    }

    public void peel(){
        System.out.println("Peel Banana");
    }

    @Override
    public void makeJuice(){
        System.out.println("Juice is made : -> Banana Juice");
    }

}
