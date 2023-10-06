/* Write a program in java which reads a positive number N from the user then indicates if N is prime or not.
    Hint: N is a prime number if its divisors are only 1 and N. */

import java.util.*;
public class Solution
{
   public static void main(String... args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n = sc.nextInt();

      int sum = 0;

      for(int i = 1; i <= n/2; i++)
      {
         if(n % i == 0)
         {
            sum = sum + i;
         }
      }
      System.out.println(sum == 1 ? "Prime" : "Non Prime");
   }
}


//Solution-2
import java.util.*;
public class Solution
{
   public static void main(String... args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n = sc.nextInt();

      boolean isPrime = true; // 'isPrime' is the variable
     
      for(int i = 2; i <= n/2; i++)
      {
         if(n % i == 0)
         {
            isPrime = false;
            break;
         }
      }
      System.out.println(isPrime ? "Prime" : "Non Prime");
   }
}
