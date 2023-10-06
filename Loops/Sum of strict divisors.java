/*  Write a program in java which displays the sum of the strict divisors of an integer given by the user.
        for example: 6 --> 1+2+3 = 6
                    10 --> 1+2+5 = 8
    Hints: The strict divisors of a numbeer N are <= N/2
           If N % i  == 0, then 'i' is a divisor of N. */


import java.util.*;
public class Solution
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int h = sc.nextInt();
      
        int sum = 0;
      
        for(int i = 1; i <= h/2; i++)
        {
            if(h % i == 0)
            {
                System.out.print(i + " ");
                sum += i;
            }    
        }
        System.out.println(); // New line
        System.out.println("Summation: " + sum);
    }
}

Output:
Enter the number: 
15
1 3 5
Summation: 9
