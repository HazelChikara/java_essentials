package decision_structures;

import java.util.Scanner;

/*
 * The If else is a decision structure that is best used in situations when there are 2 definite conditions which should
 * be executed.
 * The else part is the null hypothesis...this implies that if the condition is not met
 * it false in the alternate block of code with a key word else and open paranthesis {}
 * The program will either go one path or the other, after it is completed we
 * go back to the main program flow
 *
 */
/*
 * All sales people are expected to make at least 10 sales each week.
 * Those who achieve the requirement should be congratulated and the ones who do not are informed
 * of their variance and are encouraged to meet the requirement.
 *
 * */
public class IfElseSalaryCalculator {

    public static void main(String [] args) {

        //Benchmark per week
        int quota = 10;
        // Ask user to enter the weekly sales value
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // We name the variance between sales and quota as variance
        int variance = quota - sales;

        // The quick detour to execute conditions before we proceed

        if (sales >= quota){
            System.out.println("Well done. You have managed to reach your target this week.");
        }
        else {
            System.out.println("Sorry, you did not manage to reach the weekly target. You fell short with " +
                    variance +" sales. Better luck next week, you can do it");
        }


    }
}
