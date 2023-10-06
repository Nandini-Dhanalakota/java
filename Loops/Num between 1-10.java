/* Write a program that reads an integer between 1 and 10 from the user.
      Sample input and corresponding output are given below.
          Enter a number between 1 and 10: -5
          -5 is not between 1 and 10. Try again: 15
          15 is not between 1 and 10. Try again: 7
          7 is between 1 and 10. Thanks! */

import java.util.Scanner;
public class solution
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int h = sc.nextInt();
        while(h>10 | h<1)
        {
            System.out.println(h + " is not between 1 and 10. Try again: ");
            h = sc.nextInt();
        }
        System.out.println(h + " is between 1 and 10. Thanks!");
    }
}
