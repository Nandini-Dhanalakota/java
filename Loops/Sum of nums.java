/* Write a program in java which reads a sequence of integers from the user and stops by displaying "Done" when the sum of these values exceeds 100. */

import java.util.*;
public class Solution
{
    public static void main (String... args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(sum <= 100)
        {
            System.out.println("Enter the number: ");
            int h = sc.nextInt();
            sum = sum + h;
        }
        System.out.println("Done! Sum is " + sum);
    }
}

Output:
Enter the number: 
70
Enter the number:
30
Enter the number:
5
Done! Sum is 105


// Implementing the same code using "For-loop"

import java.util.*;
public class Solution
{
   public static void main(String... args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers: ");
     
      int sum = 0;
      
      for( ; sum <= 100; sum += sc.nextInt())
      {   
      }
      System.out.println("Done! Sum is " + sum);
   }
}

Output:
Enter the numbers: 
45
55
65
Done! Sum is 165
