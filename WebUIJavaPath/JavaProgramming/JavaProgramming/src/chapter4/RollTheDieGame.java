package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {

        //What we know
        int spaces = 20;
        int totalRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        for(int roll = 0; totalRolls > roll ; roll++ ) {

            int die = random.nextInt(6) + 1;

            currentSpace = currentSpace + die;

            // System.out.println(die+" " + currentSpace +" "+ roll+1);


            /*
            if(roll < totalRolls){
                System.out.print("Roll #" + roll+1 + " You've rolled a "
                        + die + ".");
                if(totalRolls > spaces) {
                    System.out.print( "You are now on space " + currentSpace + " " +
                            ".Congrats, you win");
                }else {
                    System.out.println( "You are now on space " + currentSpace + " " +
                            "and have " + (spaces - currentSpace) + " more to go");
                }
            }
             */


            if (currentSpace < spaces) {
                System.out.print("Roll #" + roll + 1 + " You've rolled a "
                        + die + ".");
                if (currentSpace<spaces && roll<totalRolls) {
                    System.out.println( "You are now on space " + currentSpace + " " +
                            "and have " + (spaces - currentSpace) + " more to go\n");
                }
            } else if (currentSpace == spaces && roll == totalRolls) {
                System.out.print("You are now on space " + currentSpace + " " +
                        ".Congrats, you win");
            } else if (currentSpace > spaces && roll == totalRolls) {
                System.out.println("You lose");

            } else {
                System.out.println("j");
            }

            /**
             *             if(currentSpace == lastSpace){
             *                 System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
             *                 break;
             *             }
             *             else if(currentSpace > lastSpace){
             *                 System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
             *                 break;
             *             }
             *             else if(i==maxRolls && currentSpace < lastSpace){
             *                 System.out.println("You're on space " + currentSpace + ".");
             *                 System.out.println("Unfortunately, you didn't make it to all " +
             *                         lastSpace + " spaces. You lose!");
             *             }
             *             else{
             *                 int spacesToGo = lastSpace - currentSpace;
             *                 System.out.print("You are now on space " + currentSpace +
             *                         " and have " + spacesToGo + " more to go.");
             *             }
             */
        }
    }
}
