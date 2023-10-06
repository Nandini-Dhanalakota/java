/* Write a program in java which reads a sequence of positive integers. The program stops when the user gives a negative value and shows the maximum and minimum of 
  these numbers.
  Example: 9 5 2 7 -3 --> max = 9, min = 2 */

import java.util.Scanner;

public class hara 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter a sequence of positive integers (enter a negative value to stop):");

        while (true) 
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                break; // Exit the loop when a negative value is entered
            }

            // Update max and min values
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) 
        {
            System.out.println("No positive numbers were entered.");
        } 

 /*  In this code:
'max' and 'min' are variables that are used to keep track of the maximum and minimum positive integers entered by the user. 
They are initially set to extreme values to ensure that any entered positive integer will update them.
"Integer.MIN_VALUE" is the smallest possible integer value in Java, and "Integer.MAX_VALUE" is the largest possible integer value.
The 'if' statement checks whether both 'max' and 'min' are still at their initial values after the user input loop has completed. 
If both 'max' and 'min' are still equal to their initial values, it means that no positive numbers were entered by the user.
If no positive numbers were entered, the program displays the message "No positive numbers were entered." 
This informs the user that the loop didn't find any positive integers because the initial values of 'max' and 'min' were never updated.  */
     
        else 
        {
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        }
    }
}
