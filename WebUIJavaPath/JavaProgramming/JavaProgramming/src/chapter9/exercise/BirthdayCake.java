package chapter9.exercise;

public class BirthdayCake extends Cake{

    private int candles;

    public BirthdayCake() {
        super();
        setFlavor("Orange");

    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
