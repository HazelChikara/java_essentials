package decision_structures;

import java.util.Scanner;

/* Switch behaves similarly as IfElseIf however the ifelseif checks if the condition is true whereas the
switch statement checks for equality.

Once the statement is met by a case, the program will terminate or go back to the natural logic
main path.,
it will not evaluate any other cases.

If a condition is set which is not part of the conditions specified in the switch nothing
 will occur, however there should be a default  (best practises) case which should handle anything else
 other than what is in the case statements.
*
* Still using the grading example for ABCDF, we will print out the score to the student.
* */
public class SwitchStatement {
    public static void main(String [] args) {
        //Get the score from the user
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
//Message will hold what should be displayed after evaluating the grade
        String message;

        switch (grade){
            // in the case of A
            //Use a colon not braces to invoke the decision making.
            case "A":
                message = "Excellent Job.";
                // To terminate case A from executing you use break.
                //However switch allows fall-through in the switch statement where there won't be
                //a break statement, it automatically execute the following case.
                //By design these happen eg in this case, the message in grade A and B is the same.
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good one";
                break;
            case "D":
                message = "Put in a little more effort";
                break;
            case "F":
                message = "Work harder";
                break;
            default:
                message = "Error. Please enter a valid Grade";
                break;
        }

/*
*
* */

    }
}