package decision_structures;

/* These are symbols used within operators, there are 6
*
******************************************************************************************
*           OPERATOR           *     MEANING                     *    CRITERIA           *
 *****************************************************************************************
 *            &&               *     AND           *    BOTH CONDITIONS TO BE TRUE       *
 _________________________________________________________________________________________
*            ||                *     OR            *    AT LEAST ONE MUST BE TRUE        *
*_________________________________________________________________________________________
*             !                *     NOT           *    Conditions must be false         *
 * ***************************************************************************************
* 1. All conditions to be met 1 <= 2 && 4!=5 will return true,
* 2. At keast one condition should be matched, 3 == $ || 7 < 12, this will return true
* 3. The condition must be false for it to return true !(2==3) will return true
*
* 1- 4  can be used on any primitive data except for boolean operands.
* */
public class LogicalOperators {
    public static void main(String[] args) {

        Double salary = 400.0;
        Double requiredSalary = 200.0;
        int years = 5;
        int requiredYears = 5;

        if (salary >= requiredSalary && years >= requiredYears) {
            System.out.println("Congrats! You qualify for a loan.");
        } else {
            System.out.println("Sorry, you do not qualify for a loan.");
        }
    }
}
