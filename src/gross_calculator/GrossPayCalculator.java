package gross_calculator;//package declaration

import java.sql.SQLOutput;
import java.util.Scanner;

public class GrossPayCalculator {
    //the main method starting point of the program
    public static void main(String[] args) {
    //Creating a Gross Pay Calculator for an Employee Algorithm
//        1. Get the number of hours worked (Lets say its 40) [Whole Number]
//            int hours = 40; We would have statically placed the variables that values will never change,
//            To prompt the user to insert their value, we set the value temporarily to zero
        int hours = 0;
//        Print Out a Prompt to the user
        System.out.println("How many hours did you work?");
//        To read data from the user we use a scanner
        Scanner scanner = new Scanner(System.in);
//        To get the value say scanner.nextVariableType
        hours = scanner.nextInt();

//        2. Get the hourly pay rate (25.50) [Decimal Number]
        double payRate =0;
        System.out.println("What is your pay rate?");
//        No need to declare again
        payRate = scanner.nextDouble();

//        closing the scanner
        scanner.close();

//        Print Out the promt
//        3. Multiply Hours by Pay Rate [Decimal Number]
        double grossPay = hours * payRate;
//        4. Display Results (String Gross Pay and append the multiplication result)
        System.out.println("Gross Pay:" + grossPay);
    }
}
