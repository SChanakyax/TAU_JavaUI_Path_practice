package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        //Initialize
        int numberOfStudents = 2;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all the students
        for (int i=0; i<numberOfTests; i++){

            double total = 0;
            for (int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total / numberOfTests;
            System.out.println("The average of the student #" + i+1 + " " + average);
        }
        scanner.close();
    }
}
