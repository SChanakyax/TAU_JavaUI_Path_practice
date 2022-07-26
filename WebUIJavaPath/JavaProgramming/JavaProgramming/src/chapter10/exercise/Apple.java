package chapter10.exercise;

public class Apple extends FruitMarket{

    public Apple(){
        setCalories(121);
    }

    public void removeSeeds(){
        System.out.println("Remove seeds of apple");
    }

    @Override
    public void makeJuice(){
        System.out.println("Juice is made : -> Apple Juice");
    }



}
