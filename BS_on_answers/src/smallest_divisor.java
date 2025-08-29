/*                                               *************** Find the Smallest Divisor Given a Threshold *****************
Problem Statement: You are given an array of integers 'arr' and an integer i.e. a threshold value 'limit'.
Your task is to find the smallest positive integer divisor,
such that upon dividing all the elements of the given array by it,
the sum of the division's result is less than or equal to the given threshold value.

Example 1:
Input Format: N = 5, arr[] = {1,2,3,4,5}, limit = 8
Result: 3
Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor.
The sum is 9(1 + 1 + 2 + 2 + 3)  if we choose 2 as a divisor.
Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively.
Now, their sum is equal to 7 <= 8 i.e. the threshold value.
So, 3 is the minimum possible answer.

Example 2:
Input Format: N = 4, arr[] = {8,4,2,3}, limit = 10
Result: 2
Explanation: If we choose 1, we get 17 as the sum.
If we choose 2, we get 9(4+2+1+2) <= 10 as the answer. So, 2 is the answer. */

public class smallest_divisor {
    static int get_sum(int[] arr, int divisor)
    {
        int sum = 0;
        for(int i : arr)
        {
            sum += (i + divisor - 1) / divisor;                       // ceiling without Math.ceil
        }
        return sum;
    }
//                                ****************************  BRUTE-FORCE APPROACH *************************************
//    static int find_divisor(int[] arr, int limit)
//    {
//        int max_i = Integer.MIN_VALUE;
//        for (int j : arr) {
//            max_i = Math.max(max_i, j);
//        }
//        int sum;
//        for(int i = 1; i <= max_i; i++)
//        {
//            sum = get_sum(arr,i);
//            if(sum <= limit)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
//                   ****************************  OPTIMAL APPROACH *************************************
static int find_divisor(int[] arr, int limit)
{
    int max_i = Integer.MIN_VALUE;
    for (int j : arr) {
        max_i = Math.max(max_i, j);
    }
   int low = 1, high = max_i;
   int mid, div;
    while(low <= high)
    {
        mid = low+(high-low)/2;
        div = get_sum(arr,mid);
        if(div <= limit)
            high = mid-1;
        else
            low = mid+1;

    }
    return low;
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int limit = 8;
        int ans = find_divisor(arr,limit);
        System.out.println(ans);
    }
}
