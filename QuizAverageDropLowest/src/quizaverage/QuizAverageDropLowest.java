/**
 * This program, similar to the Debug This! Exercise, will ask you to enter 
 * a series of quiz grades with acceptable values between 0 and 100. 
 * When you're done entering grades input a -1.
 * As you accept grades you should keep track of the lowest score.
 * At the end of the program it will report the total points earned,
 * count of quizzes taken and display the average grade of all quizzes,
 * with and without OMITTING THE LOWSEST SCORE.
 * 
 * Your task is to modify this existing code to accommodate this scenario.
 * 
 * SAMPLE RUN(S):
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => 80
Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => 90
Enter Quiz 3 grade (a value between 0 and 100 or a -1 to quit) => -1

Raw Scores :
Quiz Count :	2
Total Points:	170
Average Grade:	85.000000

Scores With Lowest Dropped :
Dropped Score :	80
Quiz Count :	1
Total Points:	90
Average Grade:	90.000000
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => 75
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => -2
 * Invalid Grade!
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => 0
 * Enter Quiz 3 grade (a value between 0 and 100 or a -1 to quit) => 100
 * Enter Quiz 4 grade (a value between 0 and 100 or a -1 to quit) => -1

 * Raw Scores :
 * Quiz Count :	3
 * Total Points:	175
 * Average Grade:	58.333333

 * Scores With Lowest Dropped :
 * Dropped Score :	0
 * Quiz Count :	2
 * Total Points:	175
 * Average Grade:	87.500000
 * 
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => -1
 * No Quiz Grades Entered!
 * 
 * 
 */
package quizaverage;

import java.util.Scanner;

public class QuizAverageDropLowest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0, grade=0, total=0, min = 100;
        double average=0.0;
        
        //TODO: Implement the rest of this code...
        
        while (true) {
            System.out.printf("Enter Quiz %d grade (a value between 0 and 100 or a -1 to quit) => ", count + 1);
            grade=input.nextInt();
            if (grade <-1 || grade > 100 ) {
                System.out.println("Invalid Grade!");
            } else if (grade == -1) {
                break;
            } else { //Acceptable grade
                count++;
                total += grade;
                min = grade < min ? grade: min;
            }
        }
        if (count!=0) { 
            average = total/ (double)count; 
            System.out.println("\nRaw Scores :");
            System.out.printf("Quiz Count :\t%d\n",count);
            System.out.printf("Total Points:\t%d\n",total);
            System.out.printf("Average Grade:\t%f\n\n",average);
            average = (total-min) / (double)(count-1);
            System.out.println("Scores With Lowest Dropped :");
            System.out.printf("Dropped Score :\t%d\n", min);
            System.out.printf("Quiz Count :\t%d\n",count-1);
            System.out.printf("Total Points:\t%d\n",total-min);
            System.out.printf("Average Grade:\t%f\n",average);
        } else {
            System.out.println("No Quiz Grades Entered!");
        }
    }
}
