/*  Write a program in java which displays the sum of digits of an integer read from the user.
        Example: 108 --> 1+0+8 = 9
                 1123 --> 1+1+2+3 = 7  */

import java.util.Scanner;
public class Solution
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;

        while(n>0)
        {
            int i = n % 10;
            sum += i;
            n = n/10;
        }
        System.out.println("Sum: " + sum);
    }
}
  
