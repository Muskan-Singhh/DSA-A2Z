/*                                  ********* Minimum days to make M bouquets *********

Problem Statement: You are given 'N’ roses and
you are also given an array 'arr'  where 'arr[i]'  denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
You can only pick already bloomed roses that are adjacent to make a bouquet.
You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses.
Return -1 if it is not possible.

Example 1:
Input Format: N = 8, arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2, k = 3
Result: 12
Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed.
So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.

Example 2:
Input Format: N = 5, arr[] = {1, 10, 3, 10, 2}, m = 3, k = 2
Result: -1
Explanation: If we want to make 3 bouquets of 2 flowers each, we need at least 6 flowers.
But we are given only 5 flowers, so, we cannot make the bouquets.  */

public class min_days {
    static boolean no_of_bouquets(int[] arr, int day, int m, int k)
    {
        int noB = 0, c = 0;
        for (int j : arr) {
            if (j <= day)
                c++;
            else {
                noB += (c / k);
                c = 0;
            }
        }
        noB += (c/k);
        return noB >= m;
    }
    //                         ****************************  BRUTE-FORCE APPROACH *************************************
//    static int no_of_days(int[] arr, int m, int k)
//    {
//       int n = arr.length;
//       if(n < m*k)
//           return -1;
//        int min_i = Integer.MAX_VALUE, max_i = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            min_i = Math.min(min_i, arr[i]);
//            max_i = Math.max(max_i, arr[i]);
//        }
//       for (int i = min_i; i <= max_i; i++)
//       {
//           if(no_of_bouquets(arr,i,m,k))
//               return i;
//       }
//        return -1;
//    }
//                   ****************************  OPTIMAL APPROACH *************************************
    static int no_of_days(int[] arr, int m, int k)
    {
        int n = arr.length;
        long val = m*k;
        if(n < val)                 // Impossible case
            return -1;
        int min_i = Integer.MAX_VALUE, max_i = Integer.MIN_VALUE;
        for (int j : arr) {
            min_i = Math.min(min_i, j);
            max_i = Math.max(max_i, j);
        }
        int low = min_i , high = max_i;
        int mid;
        while (low<=high)
        {
            mid = low+(high-low)/2;
            if(no_of_bouquets(arr,mid,m,k))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        int ans = no_of_days(arr,m,k);
        System.out.println(ans);
    }
}
