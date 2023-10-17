public class Solution
{
    public static void main(String... args)
    {
        //fibonacci series
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2 + " "); //printing 0 and 1
        for(int i = 2; i < count; i++) //loop doesnot execute when i=10
        {
            n3 = n1+n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}

Output:
0 1 1 2 3 5 8 13 21 34 
