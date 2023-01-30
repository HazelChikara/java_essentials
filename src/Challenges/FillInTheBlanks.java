package Challenges;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

// In this challenge, you'll create a fill-in-the-blank story program.
// Your program should ask a user for a season of the year, then a whole number,
// then an adjective, and store the input into variables.
// Finally, print the story by filling in the blanks with your variable values.
// I'll share a hint with you. The data type for text is String,
// and the scanner method to an input text is next(). Be sure to watch
// my solution video to see how I solve this challenge.
public class FillInTheBlanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Fill in the blanks challenge!");
        System.out.println("Which season are we in?");
        String season = scanner.next();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        System.out.println("Add a number");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("On a(n)" + adjective + " " + season + " day, I drink a minimum of" +
                number + "cups of coffee.");

    }
}
