package decision_structures;

import java.util.Scanner;

/*
* if-else-if statement is an extension of the if else implemented when there are strictly over 2 possible
* paths to be met.
* */
/*
*
* In this challenge we will use a grading score for students. In this case we will use ABCDEU
*
* */
public class IfElseIfStatements {
    public static void main(String [] args){

        //Get the score from the user
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();


        //Grade determination, ideally we do not know the actual grade value, but we will use this
        // loop to determine for the 5 grades available

        char grade;

        //For each branch, specify how the code should be executed except possibly the last one.

        if(score < 60){
            //Update the letter grade
            grade = 'F';

            //added a print to confirm if conditions are met
            System.out.println("You exam mark is " + grade);
        }
        else if (score < 70) {
            //Only this will be evaluated if TRUE only, if it is not met it will skip and evaluate further
           // in another block of code
            grade = 'D';
            System.out.println("You exam mark is " + grade);
        }
        else if(score < 80)
        {
            grade = 'C';
            System.out.println("You exam mark is " + grade);
        }
        else if(score < 90)
        {
            grade = 'B';
            System.out.println("You exam mark is " + grade);
        }
        //For the last condition you do not need to specify the condition
        else{
            grade = 'A';
            System.out.println("You exam mark is " + grade);
        }



    }
}
