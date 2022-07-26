package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LottaryTicket {

    public static final int LENGTH=6;
    public static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

        binarySearch(ticket,50);
        search(ticket,12);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[6];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(69) + 1;
            }while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return  ticket;
    }

    /**
     * JAVADOC comment type
     * Does a sequential search on array to find a value
     * @param array Array to srch through
     * @param randomNumber numberToSearchFor values to search for
     * @return true if found and false if not
     */
    private static boolean search(int[] array, int numberToSearchFor) {
        //Tbis is called an enhanced loop. Iterate through array each time assigns the current element to value
        for (int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        //Entire array was searched value not found at this point
        return false;

    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //array must be sorted
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);

        if(index >= 0)
            return true;
        else
            return false;
    }


    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.println(ticket[i]+" ");
        }
    }
}
