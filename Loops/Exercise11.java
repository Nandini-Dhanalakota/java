/*  Write a program in java that reads a positive integer N from the user and displays the following:
      1
      2 2
      3 3 3
      4 4 4 4
      .
      .
      N N N N N N ......   */


import java.util.*;
public class Solution
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println(); //new line
        }
    }
}

Output:
Enter the number: 
6
1
2 2 
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
