package decision_structures;
/*
If Statement

The problem is we pay people $1000 a week as base salary for working.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
//        Since it is an example we will initialize known values
        double salary = 1000;
        double bonus = 250;
        double quota = 10;

//        We will probe to determine the unknown .. finding the actual number of sales the sales person
//        made in the week using the console
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        double sales = scanner.nextDouble();
        scanner.close();

//        The IF STATEMENT to determine if the employee should be awarded a bonus. *The quick code detail
//        to see if it meets the condition

//        Structure of an If statement
        if  /* The Reserved Word*/
        (sales > quota) /* The boolean condition to evaluate that when it is met the line of code
        of what is following below should be executed. Here the condition will strictly be 11 and above because of
        our condition*/

        /* everything in the block of code/ in paranthesis will be executed if the condition is met, in out case if
        * an employee manages to make over 10 sales*/

        {
            salary += bonus;
//            it is the same as salary = salary + bonus
        }

//        Back to the program flow, we give an output of the total the employee should get in that week.
        System.out.println("The total employee weekly pay is $" + salary +".");
    }
}
