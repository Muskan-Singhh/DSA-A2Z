/*                                                          ****** Koko Eating Bananas ******

Problem Statement: A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas.
An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.
Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas.
If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
Example 1:
Input Format: N = 4, a[] = {7, 15, 6, 3}, h = 8
Result: 5
Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly.
So, he will take 8 hours to complete all the piles.

Example 2:
Input Format: N = 5, a[] = {25, 12, 8, 14, 19}, h = 5
Result: 25                                                                          */

public class koko_eat_bananas
{
    static int find_max(int[] arr)
    {
        int n = arr.length;
        int max_ele = arr[0];
        for(int i = 1; i<n; i++)
        {
            if(arr[i] > max_ele)
                max_ele = arr[i];
        }
        return max_ele;
    }
    static int calc_total(int[] arr, int hour)
    {
        int n = arr.length;
        int time = 0;
        for(int i = 0; i < n; i++)
        {
            time += Math.ceil((double)(arr[i]) / (double)(hour));
        }
        return time;
    }
//                                     ****************************  BRUTE-FORCE APPROACH *************************************
//    static int minEatingSpeed(int[] piles, int h)
//    {
//        int max_i = find_max(piles);
//        int ans = 0;
//        for (int i = 1; i <= max_i; i++)
//        {
//            ans = calc_total(piles,i);
//            if(ans <= h)
//                return i;
//        }
//        return -1;
//    }

//                                     ****************************  OPTIMAL APPROACH *************************************
    static int minEatingSpeed(int[] piles, int h)
    {
       int low = 0 , high = find_max(piles);
       int mid , time = 0;
       while (low <= high)
       {
           mid = low+(high-low)/2;
           time = calc_total(piles,mid);
           if(time <= h)
               high = mid-1;
           else
               low = mid+1;

       }
        return low;
    }
    public static void main(String[] args) {
           int[] arr = {7,15,6,3};
           int h = 8;
            int ans = minEatingSpeed(arr,h);
        System.out.println(ans);
    }
}
