/* We use the integers a, b and n to create the following series:
  (a + 2^0*b), (a + 2^0*b + 2^1*b), (a + 2^0*b + 2^1*b + 2^2*b), .................(a + 2^0*b + 2^1*b + 2^2*b + .... + 2^n-1*b)
  hackerrank loops2
  */
import java.util.Scanner;
public class om
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner (System.in);
        int q = sc.nextInt();
        for(int i = 1; i <= q; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a+b; //(a + 2**0*b)
            System.out.print(sum);
            for(int j = 1; j<n; j++)
            {
                sum += b*Math.pow(2,j); //sum = sum + b*Math.pow(2,j) --> This format gives error
                System.out.print(" " + sum);

            }
            System.out.println();
        }
    }
}
