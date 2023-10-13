/*  Write a program in java that reads a positive integer and displays the following:
      Enter the number: 5
      * * * * *
      * * * * *
      * * * * *
      * * * * *
      * * * * *   */

import java.util.*;
public class om
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int h =  sc.nextInt();
        
        for(int i = 1; i <= h; i++)
        {
            for(int j = 1; j <= h; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
  
