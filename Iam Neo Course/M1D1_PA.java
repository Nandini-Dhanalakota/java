/* Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array that adds to a given number S and return the left and right indexes of that sub-array. 
In the case of multiple subarrays, return the subarray indexes that come first when moving from the left to right.
  Note: Both the indexes in the array should be according to 1-based indexing. You have to return an array list consisting of two elements, left and right. 
  If no such subarray exists, return an array consisting of element -1.
  Example1
  
  Input:
  N = 5, S = 12
  A[] = {1,2,3,7,5}

  Output:
  2 4 
  Explanation:
  The sum of elements from the 2nd position to the 4th position is 12.

  Example2

  Input:
  N = 10, S = 15
  A[] = {1,2,3,4,5,6,7,8,9,10}

  Output:
  1 5
  Exaplanation:
  The sum of elements from the 1st position to the 5th position is 15.
  */


  //code
import java.util.*;

class MaxProfit 
{
    public static void main(String... args) 
  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) 
        {
            A[i] = sc.nextInt();
        }

        // process
        
        boolean found = false;
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < N; i++) 
        {
            int currentSum = 0;
            for (int j = i; j < N; j++) 
            {
                currentSum += A[j];
                if (currentSum == S) 
                {
                    leftIndex = i;
                    rightIndex = j;
                    found = true;
                    break;
                }
            }
            if (found) 
            {
                break;
            }
        }

        if (found) 
        {
            System.out.println((leftIndex + 1) + " " + (rightIndex + 1));
        } 
        else 
        {
            System.out.println("-1");
        }
    }
}

//OR

import java.util.*;

class trin 
{
    public static void main(String... args) 
  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) 
        {
            A[i] = sc.nextInt();
        }

        // process
    
        int currentSum = 0;
        int left = 0;
        int right = 0;
        boolean found = false;

        while (right < N) 
        {
            currentSum += A[right];
            while (currentSum > S) 
            {
                currentSum -= A[left];
                left++;
            }
            if (currentSum == S) 
            {
                found = true;
                break;
            }
            right++;
        }

        if (found) 
        {
            System.out.println((left + 1) + " " + (right + 1));
        } 
        else 
        {
            System.out.println("-1");
        }
    }
}


/* Suppose you have been keeping an eye on the stock market for a while, and you have been tracking the daily prices of a particular stock. You want to make a profit by buying and selling the stock at the right time.
  Given the array of prices of the stock on aech day, you need to figure out the best strategy to maximize your profit.
  However, if the stock prices are constantly decreasing, there is no way for you to make a profit.
  Example1:

  Input:
  7
  arr[] = {100,180,260,310,40,535,695}

  Output:
  865
  Explantion:
  Buy stock on day-0 and sell it on day-3 => 310 - 100 = 210
  Buy stock on day-4 and sell it on day-6 => 695 - 40 = 655
  Maximum Profit = 210 + 655 = 865

  Example2:
  Input:
  5
  arr[] = {4,2,2,2,4}

  Output:
  2
  Explanation:
  Buy the stock on day-1 and sell it on day-4 => 4 - 2 = 2
  Maximum Profit = 2
  */


  //code
  import java.util.*;

class trin 
{
    public static void main(String... args) 
  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // process
    
        int output = 0;
        int maxprofit =0;
        int min = Integer.MAX_VALUE;
        for(int element : arr)
        {
            if(element < min)
            {
                min = element;
                //System.out.println(maxprofit);
                output += maxprofit;
            }
            else
            {
                int pro = element-min;
                if(pro > maxprofit)
                {
                    maxprofit = pro;
                }
            }
        }
        //System.out.println(maxprofit);
        System.out.println(output + maxprofit);
    }
}

//OR (with different logic/explanation)

public class MaxProfit 
{
    public static int maxProfit(int[] arr) 
  {
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > arr[i - 1]) 
            {
                maxProfit += arr[i] - arr[i - 1];
            }
        }
        return maxProfit;
  }

    public static void main(String[] args) 
    {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int maxProfit = maxProfit(arr);
        System.out.println("Maximum profit: " + maxProfit);
    }
}

  
    
