package chapter6;

public class Month {

    public static String getMonth(int month){
        switch (month){
            case 1: return "January";
            case 2: return "February";
            default:return "Invalid month";
        }
    }

    public static int getMonth(String month){
        switch (month){
            case "January": return 1;
            case "February": return 2;
            default: return 0;
        }
    }
}
