package chapter10.exercise;

public class TestClass {

    public static void main(String[] args) {
        FruitMarket a1 = new FruitMarket();
        System.out.println(a1.getCalories());
        a1.makeJuice();

        FruitMarket apple = new Apple();
        apple.makeJuice();

        FruitMarket banana = new Banana();
        banana.makeJuice();

        Apple aa = new Apple();
        aa.removeSeeds();

        FruitMarket ab = new Apple();
        aa.removeSeeds();

        FruitMarket applex = new Apple();
        ((Apple) applex).removeSeeds();


        squeeze(apple);

    }

    public static void squeeze(FruitMarket fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }

}
