package decision_structures;

import java.util.Scanner;

/* These are similar to switch statement only that they allow you to assign a value when the conditions
of a case is matched.

* */
public class SwitchExpressions {
    public static void main(String [] args) {
        //Get the score from the user
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
/*Continuation of switch statement but here we will initialize the message variable with whatever
 outcome of the cases grade.
  You replace the colon (:) with -> [It means the same], this means when the grade is A assign an "Excellent
  Job!" message.
They do not need braces because there is no fall through like the switch statements.

 */

        String message = switch (grade){

            case "A" -> "Excellent Job.";
            case "B" -> "Great job";
            case "C" ->  "Good one";
            case "D" -> "Put in a little more effort";
            case "F" -> "Work harder";
//           For the same message in multiple cases you can add a comma
            case "G", "H" -> "Some message here.";

            default -> "Error. Please enter a valid Grade";
        };
//        add a colon at the end of the witch

        /* You can do more than just assignment with SE, so you enclose in {}
        * eg: We have 2 numbers & we want to do calculations and assign the sum or difference to the
        * console for instance:
        *
        * int firstNumber = 7;
        * int secondNumber = 12;
        * int result = switch (calculation){
        *
        * case "add", "+" ->{
        * sout("Summation value for " + firstName + secondName " is ");
        * yield firstNumber + secondNumber;
        * }
        *
        * * case "subtract", "-" ->{
         * sout("Difference value for " + firstName + secondName " is ");
         * yield firstNumber - secondNumber;
         * default -> 0;
         * }
         * */

    }
}